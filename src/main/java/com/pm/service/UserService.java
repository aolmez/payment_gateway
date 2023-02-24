package com.pm.service;

import java.util.List;

import com.pm.entity.User;
import com.pm.exception.UserNotFoundException;

public interface UserService {
	User getUserById(long id) throws UserNotFoundException;

	List<User> getAllUsers();

	User updateUser(long id, User user) throws UserNotFoundException;

	User saveUser(User user);

	void deleteUser(long id) throws UserNotFoundException;
}
