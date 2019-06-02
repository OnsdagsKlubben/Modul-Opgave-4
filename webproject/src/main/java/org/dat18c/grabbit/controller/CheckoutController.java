package org.dat18c.grabbit.controller;

import org.dat18c.grabbit.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * CheckOutController håndtere de requests, der har med indkøbskurven og checkout at gøre.
 * @author Frederik Lundbeck Jørgensen
 */
@Controller
public class CheckoutController 
{
    @Autowired
    private CheckoutService checkoutService;

    /**
     * Bliver brugt når brugeren ligger en vare i sin indkøbskurv.
     * Metoden kalder en anden metode fra vores objekt checkoutService,
     * denne metode ligger menu item id'et til en hashmap kollektion.
     * @param id
     * @return
     */
    @PostMapping(value="/add/{id}")
    public String addFoodItem(@PathVariable("id") int id) {

        checkoutService.addMenuItem(id);
        return "user/PostTest";
    }
    
}