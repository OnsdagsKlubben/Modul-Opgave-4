package org.dat18c.grabbit.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * CheckOutController
 */
public class CheckoutController {

    @GetMapping(value = "/user/checkout")
    public String getCheckoutPage()
    {
        return "/user/Checkout";
    }
}