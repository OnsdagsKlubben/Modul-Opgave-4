package org.dat18c.webpage_test.controller;

import org.dat18c.webpage_test.model.MenuItem;
import org.dat18c.webpage_test.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * MenuItemController
 */
@Controller
public class MenuItemController 
{
    @Autowired
    private MenuItemService menuItemService;
    
    @GetMapping(value = "/admin/menu/new")
    public String createMenuItem(Model model)
    {
        model.addAttribute("menuItem", new MenuItem());
        return "admin/menu/createMenuItem";
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
        return "admin/menu/showMenu";
    }

    @GetMapping(value = "/admin/menu/update/{id}")
    public String showUpdateItem(@PathVariable("id") int id, Model model) 
    {
        model.addAttribute("menuItem", menuItemService.findMenuItemById(id));
        return "admin/menu/updateMenuItem";
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
}