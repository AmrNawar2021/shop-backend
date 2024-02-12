package com.amrfawzi.ShopManageMentApp.serviceimpl;
import com.amrfawzi.ShopManageMentApp.models.Category;
import com.amrfawzi.ShopManageMentApp.repositories.CategoryRepository;
import com.amrfawzi.ShopManageMentApp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

}


