package com.pm.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

import com.pm.entity.User;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
  
}