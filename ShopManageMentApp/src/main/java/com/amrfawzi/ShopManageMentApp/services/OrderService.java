package com.amrfawzi.ShopManageMentApp.services;

import com.amrfawzi.ShopManageMentApp.models.Order;

import java.util.List;

// ProductService.java
public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    void saveOrder(Order order);

}
