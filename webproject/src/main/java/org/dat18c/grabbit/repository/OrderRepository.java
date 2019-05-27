package org.dat18c.grabbit.repository;

import org.dat18c.grabbit.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderRepository
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> 
{
}