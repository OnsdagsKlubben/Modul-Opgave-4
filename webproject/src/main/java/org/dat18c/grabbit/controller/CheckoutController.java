package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CheckOutController
 */
@Controller
public class CheckoutController {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping(value = "/user/checkout")
    public String getCheckoutPage(Model model)
    {
        model.addAttribute("menuItems", menuItemService.findAllMenuItems());
        return "/user/Checkout";
    }
}