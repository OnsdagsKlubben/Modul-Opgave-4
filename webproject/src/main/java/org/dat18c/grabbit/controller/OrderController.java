package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * OrderController
 * Sørger for at håndtere alle de request der har
 * med orders at gøre.
 * @author Frederik Lundbeck Jørgensen & Nicklas List
 */
@Controller
public class OrderController 
{
    @Autowired
    private OrderService orderService;

    /**
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen Orders.html
     */
    @GetMapping(value = "/admin/orders")
    public String showAllOrdersPage(Model model)
    {
        model.addAttribute("orders", orderService.findAllOrders());
        return "admin/orders/Orders";
    }

    /**
     * @param id, id'et for den order der skal opdateres.
     * @param model, objektet som bliver sendt til viewet.
     * @return stien til html filen ViewOrder.html
     */
    @GetMapping(value = "/admin/orders/view/{id}")
    public String viewOrderByIdPage(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("order", orderService.findOrderById(id));
        return "admin/orders/ViewOrder";
    }
    /**
     * @param id, id'et for den order der skal slettes.
     * @return En String der indeholder en addresse til /admin/orders
     */
    @GetMapping(value = "/admin/orders/delete/{id}")
    public String deleteOrder(@PathVariable("id") int id)
    {
        orderService.deleteById(id);
        return "redirect:/admin/orders";
    }

}