package com.amrfawzi.ShopManageMentApp.serviceimpl;

import com.amrfawzi.ShopManageMentApp.models.Order;
import com.amrfawzi.ShopManageMentApp.repositories.OrderRepository;
import com.amrfawzi.ShopManageMentApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// ProductServiceImpl.java
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

}

