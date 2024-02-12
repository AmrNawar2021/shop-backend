package com.amrfawzi.ShopManageMentApp.controllers;

import com.amrfawzi.ShopManageMentApp.models.User;
import com.amrfawzi.ShopManageMentApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user/list";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user/details";
    }

    @GetMapping("/create")
    public String showUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user/create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

}
