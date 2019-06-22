package org.dat18c.grabbit.service;

import java.util.List;
import java.util.Optional;

import org.dat18c.grabbit.model.Order;
import org.dat18c.grabbit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * OrderService
 * @author Søren Carlsen
 */
@Service
public class OrderService 
{
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders()
    {
        return orderRepository.findAll();
    }

    public Order findOrderById(int id)
    {
        Optional<Order> optionalOrder = orderRepository.findById(id);

        if (optionalOrder.isPresent()) {
            return optionalOrder.get();
        }
        return null;
    }

    public void saveOrder(Order order)
    {
        orderRepository.saveAndFlush(order);
    }

    public void deleteById(int id)
    {
        orderRepository.deleteById(id);
    }
}