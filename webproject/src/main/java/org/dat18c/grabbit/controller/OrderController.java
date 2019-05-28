package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.model.Order;
import org.dat18c.grabbit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * OrderController
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class OrderController 
{
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/user/order")
    public String getUserOrderView(Model model)
    {
        model.addAttribute("orders", orderService.findAllOrders());
        return "user/Menu";
    }

    @GetMapping(value = "/admin/orders")
    public String showAllOrdersPage(Model model)
    {
        model.addAttribute("orders", orderService.findAllOrders());
        return "admin/orders/Orders";
    }

    @GetMapping(value = "/admin/orders/view/{id}")
    public String viewOrderByIdPage(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("order", orderService.findOrderById(id));
        return "admin/orders/ViewOrder";
    }

    @GetMapping(value = "/admin/orders/delete/{id}")
    public String deleteOrder(@PathVariable("id") int id)
    {
        orderService.deleteById(id);
        return "redirect:/admin/orders";
    }

    @PutMapping(value = "/admin/orders/update")
    public String viewOrder(@ModelAttribute Order order)
    {
        return "redirect:/admin/orders";
    }


}