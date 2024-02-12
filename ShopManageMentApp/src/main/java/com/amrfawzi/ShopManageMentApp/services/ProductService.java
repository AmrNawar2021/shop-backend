package com.amrfawzi.ShopManageMentApp.services;

import com.amrfawzi.ShopManageMentApp.models.Product;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void saveProduct(Product product);

}
