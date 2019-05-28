package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.model.MenuItem;
import org.dat18c.grabbit.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * MenuItemController
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class MenuItemController 
{
    @Autowired
    private MenuItemService menuItemService;
    
    @GetMapping(value = "/admin/menu/new")
    public String createMenuItem(Model model)
    { 
        return "admin/menu/NewMenuItem";
    }

    @PostMapping(value = "/admin/menu/create")
    public String createMenuItem(@ModelAttribute MenuItem menuItem)
    {
        menuItemService.saveMenuItem(menuItem);
        return "redirect:/admin/menu";
    }

    @GetMapping(value = "/admin/menu")
    public String showMenu(Model model) 
    {
        model.addAttribute("menuItems", menuItemService.findAllMenuItems());
        return "admin/menu/Menu";
    }

    @GetMapping(value = "/admin/menu/update/{id}")
    public String showUpdateItem(@PathVariable("id") int id, Model model) 
    {
        model.addAttribute("menuItem", menuItemService.findMenuItemById(id));
        return "admin/menu/EditMenuItem";
    }

    @PostMapping(value = "/admin/menu/update")
    public String updateMenuItem(@ModelAttribute MenuItem menuItem) 
    {
        menuItemService.saveMenuItem(menuItem);
        return "redirect:/admin/menu";
    }

    @GetMapping(value = "/admin/menu/delete/{id}")
    public String deleteMenuItem(@PathVariable("id") int id)
    {
        menuItemService.deleteMenuItemById(id);
        return "redirect:/admin/menu";
    }
    
    @GetMapping(value = "/user/menu")
    public String getUserMenuView(Model model)
    {
        model.addAttribute("menuItems", menuItemService.findAllMenuItems());
        return "/user/Menu";
    }
}