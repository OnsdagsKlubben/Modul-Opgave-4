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
 * Sørger for at håndtere alle de request der har
 * med menu items at gøre.
 * @author Frederik Lundbeck Jørgensen & Nicklas List 
 */
@Controller
public class MenuItemController 
{
    @Autowired
    private MenuItemService menuItemService;
    
    /**
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen NewMenuItem.html
     */
    @GetMapping(value = "/admin/menu/new")
    public String createMenuItem(Model model)
    { 
        return "admin/menu/NewMenuItem";
    }

    /**
     * @param menuItem, det objekt som bliver sendt fra viewet til metoden her.
     * @return En String der indeholder en addresse til /admin/menu
     */
    @PostMapping(value = "/admin/menu/create")
    public String createMenuItem(@ModelAttribute MenuItem menuItem)
    {
        menuItemService.saveMenuItem(menuItem);
        return "redirect:/admin/menu";
    }

    /**
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen Menu.html
     */
    @GetMapping(value = "/admin/menu")
    public String showMenu(Model model) 
    {
        model.addAttribute("menuItems", menuItemService.findAllMenuItems());
        return "admin/menu/Menu";
    }

    /**
     * @param id, det menu item id som skal opdateres
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen EditMenuItem.html
     */
    @GetMapping(value = "/admin/menu/update/{id}")
    public String showUpdateItem(@PathVariable("id") int id, Model model) 
    {
        model.addAttribute("menuItem", menuItemService.findMenuItemById(id));
        return "admin/menu/EditMenuItem";
    }

    /**
     * @param menuItem, det objekt som bliver sendt fra viewet til metoden her.
     * @return En String der indeholder en addresse til /admin/menu
     */
    @PostMapping(value = "/admin/menu/update")
    public String updateMenuItem(@ModelAttribute MenuItem menuItem) 
    {
        menuItemService.saveMenuItem(menuItem);
        return "redirect:/admin/menu";
    }

    /**
     * @param id, det menu item id som skal slettes.
     * @return En String der indeholder en addresse til /admin/menu
     */
    @GetMapping(value = "/admin/menu/delete/{id}")
    public String deleteMenuItem(@PathVariable("id") int id)
    {
        menuItemService.deleteMenuItemById(id);
        return "redirect:/admin/menu";
    }
    
    /**
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen Menu.html
     */
    @GetMapping(value = "/user/menu")
    public String getMenuPage(Model model)
    {
        model.addAttribute("menuItems", menuItemService.findAllMenuItems());
        return "user/Menu";
    }
}