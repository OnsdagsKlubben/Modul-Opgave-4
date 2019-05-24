package org.dat18c.webpage_test.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
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
        return "/home";
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
            return "redirect:/user/order";
        }
    }

    @GetMapping("/user/order")
    public String getUserMenuPage()
    {
        return "/user/showMenu";
    }

    @RequestMapping("/admin/dashboard")
    public String getAdminDashboard()
    {
        return "admin/dashboard";
    }

    @RequestMapping("/login")
    public String login() 
    {
        return "login";
    }
}