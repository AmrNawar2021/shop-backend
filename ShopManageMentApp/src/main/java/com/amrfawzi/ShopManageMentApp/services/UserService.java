package com.amrfawzi.ShopManageMentApp.services;

import com.amrfawzi.ShopManageMentApp.models.User;

import java.util.List;

// ProductService.java
public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);

}

