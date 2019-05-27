package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * OrderController
 */
@Controller
public class OrderController 
{
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/admin/orders")
    public String showAllOrdersPage(Model model)
    {
        model.addAttribute("orders", orderService.findAllOrders());
        return "admin/orders/ShowOrders";
    }

    @GetMapping(value = "/admin/orders/view/{id}")
    public String viewOrderByIdPage(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("order", orderService.findOrderById(id));
        return "admin/orders/ViewOrder";
    }


}