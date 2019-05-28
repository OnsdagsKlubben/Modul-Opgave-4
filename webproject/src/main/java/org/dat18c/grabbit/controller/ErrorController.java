package org.dat18c.grabbit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ErrorController
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class ErrorController 
{
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String serverException(Throwable throwable, Model model)
    {
        String errorMessage = (throwable != null ?  throwable.getMessage() : "Unknown error");
        model.addAttribute("errorMessage", errorMessage);

        return "Error";
    }
    
}