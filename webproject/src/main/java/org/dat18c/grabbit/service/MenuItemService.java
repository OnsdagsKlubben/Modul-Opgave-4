package org.dat18c.grabbit.service;

import java.util.List;
import java.util.Optional;

import org.dat18c.grabbit.model.MenuItem;
import org.dat18c.grabbit.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MenuItemService
 * @author Frederik Lundbeck Jørgensen & Marcus Bender Knudsen
 */
@Service
public class MenuItemService 
{
    @Autowired
    private MenuItemRepository menuItemRepository;
    
    public void saveMenuItem(MenuItem menuItem)
    {
        menuItemRepository.saveAndFlush(menuItem);
    }

    public List<MenuItem> findAllMenuItems()
    {
        return menuItemRepository.findAll();
    }

    public MenuItem findMenuItemById(int id)
    {
        Optional<MenuItem> optionalMenuItem = menuItemRepository.findById(id);
        
        if (optionalMenuItem.isPresent()) 
        {
            return optionalMenuItem.get();
        }
        return null;
    }

    public void deleteMenuItemById(int id)
    {
        menuItemRepository.deleteById(id);
    }
}