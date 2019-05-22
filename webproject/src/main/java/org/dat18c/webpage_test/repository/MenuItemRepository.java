package org.dat18c.webpage_test.repository;

import org.dat18c.webpage_test.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MenuItemRepository
 */
@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> 
{
}