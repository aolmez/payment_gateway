package com.pm.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pm.entity.User;
import com.pm.exception.UserNotFoundException;
import com.pm.repository.UserRepository;
import com.pm.service.UserService;

import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {
	private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(long id) throws UserNotFoundException {
        return userRepository.findByIdOptional(id).orElseThrow(() -> new UserNotFoundException("There user doesn't exist"));
    }

    @Override
    public List<User> getAllUsers() {
    	log.info("request to get all user");
        return userRepository.listAll();
    }

	@Transactional
	@Override
	public User updateUser(long id, User user) throws UserNotFoundException {
		User existingUser = getUserById(id);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setLangKey("vn");
		userRepository.persist(existingUser);
		return existingUser;
	}

    @Transactional
    @Override
    public User saveUser(User user) {
        userRepository.persistAndFlush(user);
        return user;
    }

    @Transactional
    @Override
    public void deleteUser(long id) throws UserNotFoundException {
        userRepository.delete(getUserById(id));
    }
}
