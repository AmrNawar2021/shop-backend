package com.amrfawzi.ShopManageMentApp.serviceimpl;

import com.amrfawzi.ShopManageMentApp.models.Product;
import com.amrfawzi.ShopManageMentApp.repositories.ProductRepository;
import com.amrfawzi.ShopManageMentApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// ProductServiceImpl.java
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    // Implement other methods if needed
}

