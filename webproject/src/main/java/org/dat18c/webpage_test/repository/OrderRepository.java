package org.dat18c.webpage_test.repository;

import org.dat18c.webpage_test.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderRepository
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> 
{
}