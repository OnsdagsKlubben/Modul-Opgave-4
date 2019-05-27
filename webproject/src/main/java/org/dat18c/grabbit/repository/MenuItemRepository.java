package org.dat18c.grabbit.repository;

import org.dat18c.grabbit.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MenuItemRepository
 */
@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> 
{
}