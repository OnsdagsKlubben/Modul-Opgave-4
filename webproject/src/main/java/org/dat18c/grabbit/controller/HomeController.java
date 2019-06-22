package org.dat18c.grabbit.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 * Denne controller håndtere requests til funktioner og views der er tilgængeligt
 * for både users og admins. 
 * @author Frederik Lundbeck Jørgensen & Søren Carlsen
 */
@Controller
public class HomeController 
{
    /**
    * @return En String der indeholder en addresse til /home
    */
    @GetMapping("/")
    public String getIndexRedirectPage() 
    {
        return "redirect:home";
    }

    /**
     * @return Stien til html filen Home.html.
     */
    @GetMapping("/home")
    public String getHomePage() 
    {
        return "/Home";
    }

    /**
     * Denne metode redirecter personen der logger ind, til en bestemt side baseret på hvilken rolle personen har.
     * Hvis personen har en administrator rolle vil de blive redirected til /admin/dashboard.
     * Hvis personen har en user rolle vil de blive redirected til /user/menu. 
     */
    @GetMapping("/login/redirect")
    public String redirectAfterLogin()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals("ADMIN"))) 
        {
            return "redirect:/admin/dashboard";
        } 
        else
        {
            return "redirect:/user/menu";
        }
    }
    
    /**
     * @return Stien til html filen Dashboard.html.
     */
    @GetMapping("/admin/dashboard")
    public String getAdminDashboard()
    {
        return "admin/Dashboard";
    }

    /**
     * @return Stien til html filen Login.html.
     */
    @GetMapping("/login")
    public String login() 
    {
        return "Login";
    }

    /**
     * @return Stien til html filen SignUp.html.
     */
    @GetMapping("/sign-up")
    public String getSignUpView()
    {
        return "SignUp";
    }
    
}