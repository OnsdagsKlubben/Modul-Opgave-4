package org.dat18c.grabbit.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * CheckoutService
 * @author Frederik Lundbeck Jørgensen
 */
@Service
public class CheckoutService {

    private Map<Integer, Integer> menuItems = new HashMap<Integer,Integer>();

    /**
     * @return the menuItems
     */
    public Map<Integer, Integer> getMenuItems() 
    {
        return Collections.unmodifiableMap(menuItems);
    }

    /**
     * 
     * @param id
     */
    public void addMenuItem(int id)
    {
        if (menuItems.containsKey(id)) 
        {
            menuItems.replace(id, menuItems.get(id) + 1);
            System.out.println("added id = " + id + " to cart!");
        } 
        else
        {
            menuItems.put(id, 1);
        }
    }

    /**
     * 
     * @param id
     */
    public void removeMenuItem(int id)
    {
        if (menuItems.containsKey(id)) 
        {
            if (menuItems.get(id) > 1) 
            {
                menuItems.replace(id, menuItems.get(id) - 1);    
            }
            else if (menuItems.get(id) == 1)
            {
                menuItems.remove(id);
            }    
        }
    }

}