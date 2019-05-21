package org.dat18c.webpage_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * MenuItemController
 */
@Controller
public class MenuItemController 
{
    @RequestMapping(value="/admin/menu")
    public String requestMethodName() 
    {
        return "admin/menu";
    }
    
}