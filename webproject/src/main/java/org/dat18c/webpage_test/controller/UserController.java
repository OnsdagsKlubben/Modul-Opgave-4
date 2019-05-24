package org.dat18c.webpage_test.controller;

import org.dat18c.webpage_test.model.User;
import org.dat18c.webpage_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * UserController
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public String createUser(@ModelAttribute User user)
    {
        userService.saveUser(user);
        return "/login";
    }

    @GetMapping(value = "/admin/users/new")
    public String getCreateUserPage(Model model) 
    {
        model.addAttribute("user", new User());
        return "/admin/users/createUser";
    }
    
    @GetMapping(value = "/admin/users")
    public String showUsers(Model model)
    {
        model.addAttribute("users", userService.findAllUsers());
        return "/admin/users/showUsers";
    }

    @GetMapping(value = "/admin/users/delete/{id}")
    public String deleteUser(@PathVariable("id") int id)
    {
        userService.deleteUserById(id);
        return "redirect:/admin/users";
    }
}