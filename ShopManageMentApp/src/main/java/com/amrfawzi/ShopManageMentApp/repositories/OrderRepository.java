package com.amrfawzi.ShopManageMentApp.repositories;

import com.amrfawzi.ShopManageMentApp.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
