package com.amrfawzi.ShopManageMentApp.serviceimpl;

import com.amrfawzi.ShopManageMentApp.models.User;
import com.amrfawzi.ShopManageMentApp.repositories.ProductRepository;
import com.amrfawzi.ShopManageMentApp.repositories.UserRepository;
import com.amrfawzi.ShopManageMentApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// ProductServiceImpl.java
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    // Implement other methods if needed
}

