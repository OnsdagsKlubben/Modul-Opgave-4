package org.dat18c.grabbit.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * ErrorImplementationController 
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class ErrorImplementationController implements ErrorController
{
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) 
    {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        
        if(status != null)
        {
            Integer statusCode = Integer.valueOf(status.toString());

            switch (statusCode) 
            {
                case 403:
                    return "errors/403"; //Forbidden
                case 404:
                    return "errors/404"; //Not found
                case 500:
                    return "errors/500"; //Internal server error
                default:
                    break;
            }
        }
        return "errors/Error";
    }

    @Override
    public String getErrorPath() 
    {
        return "/error";
    }
}