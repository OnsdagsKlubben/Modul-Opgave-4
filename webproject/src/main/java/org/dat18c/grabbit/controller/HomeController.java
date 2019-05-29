package org.dat18c.grabbit.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class HomeController 
{
    @GetMapping("/")
    public String getIndexRedirectPage() 
    {
        return "redirect:home";
    }

    @GetMapping("/home")
    public String getHomePage() 
    {
        return "/Home";
    }

    @GetMapping("/login/redirect")
    public String redirectAfterLogin()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        //If authenticated userdetails has admin role
        if (authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals("ADMIN"))) 
        {
            //Return admin dashboard
            return "redirect:/admin/dashboard";
        } 
        else
        {
            return "redirect:/user/";
        }
    }
    
    @RequestMapping("/admin/dashboard")
    public String getAdminDashboard()
    {
        return "admin/Dashboard";
    }

    @RequestMapping("/login")
    public String login() 
    {
        return "Login";
    }

    @GetMapping("/sign-up")
    public String getSignUpView()
    {
        return "SignUp";
    }
    
}