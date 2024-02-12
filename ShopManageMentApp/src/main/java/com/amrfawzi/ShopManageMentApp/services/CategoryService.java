package com.amrfawzi.ShopManageMentApp.services;

import com.amrfawzi.ShopManageMentApp.models.Category;
import com.amrfawzi.ShopManageMentApp.models.Product;

import java.util.List;

// ProductService.java
public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    void saveCategory(Category category);

}

