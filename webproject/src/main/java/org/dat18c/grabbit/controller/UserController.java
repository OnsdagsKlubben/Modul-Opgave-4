package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.model.User;
import org.dat18c.grabbit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * UserController
 * Sørger for at håndtere alle de request der har
 * med brugere at gøre.
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class UserController 
{
    @Autowired
    private UserService userService;

    /**
     * @param user, det objekt som bliver sendt fra viewet til metoden her.
     * @return En String der indeholder en addresse til /login
     */
    @PostMapping(value = "/register")
    public String createUser(@ModelAttribute User user)
    {
        userService.saveUser(user);
        return "redirect:/login";
    }
    
    /**
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen Orders.html
     */
    @GetMapping(value = "/admin/users")
    public String showUsers(Model model)
    {
        model.addAttribute("users", userService.findAllUsers());
        return "/admin/users/Users";
    }

    /**
     * @param id, id'et for den user der skal slettes.
     * @return En String der indeholder en addresse til /admin/users
     */
    @GetMapping(value = "/admin/users/delete/{id}")
    public String deleteUser(@PathVariable("id") int id)
    {
        userService.deleteUserById(id);
        return "redirect:/admin/users";
    }


}