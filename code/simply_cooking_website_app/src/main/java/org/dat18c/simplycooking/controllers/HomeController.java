package org.dat18c.simplycooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 */
@Controller
public class HomeController 
{
    @GetMapping("/")
    public String getHomeView()
    {
        return "Home";
    }

    @GetMapping("login")
    public String getLoginView()
    {
        return "Login";
    }
}