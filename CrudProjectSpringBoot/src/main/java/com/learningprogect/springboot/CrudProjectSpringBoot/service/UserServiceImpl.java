package com.learningprogect.springboot.CrudProjectSpringBoot.service;

import com.learningprogect.springboot.CrudProjectSpringBoot.dao.UserDAO;
import com.learningprogect.springboot.CrudProjectSpringBoot.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User showUserById(int id) {
        return userDAO.showUserById(id);
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        userDAO.deleteUserById(id);
    }
}
