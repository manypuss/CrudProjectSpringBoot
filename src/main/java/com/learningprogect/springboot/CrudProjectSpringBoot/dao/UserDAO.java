package com.learningprogect.springboot.CrudProjectSpringBoot.dao;


import com.learningprogect.springboot.CrudProjectSpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUserById(int id);

    void deleteUserById(int id);
}
