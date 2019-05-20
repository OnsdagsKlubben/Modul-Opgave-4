package org.dat18c.webpage_test.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {


    @Value("${coach.name}")
	private String myAge;

    @GetMapping("/")
    public String getIndexRedirectPage() {
        return "redirect:home";
    }

    @GetMapping("/home")
    public String getHomePage() {
        return "home";
    }


    @GetMapping("/login")
    public String getLoginPage() {
        System.out.println(myAge);
        return "login";
    }

    
}