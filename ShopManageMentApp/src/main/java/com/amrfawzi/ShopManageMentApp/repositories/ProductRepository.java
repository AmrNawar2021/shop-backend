package com.amrfawzi.ShopManageMentApp.repositories;

import com.amrfawzi.ShopManageMentApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
