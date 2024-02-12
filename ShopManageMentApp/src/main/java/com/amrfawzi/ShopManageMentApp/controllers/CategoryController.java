package com.amrfawzi.ShopManageMentApp.controllers;

import com.amrfawzi.ShopManageMentApp.models.Category;
import com.amrfawzi.ShopManageMentApp.models.Product;
import com.amrfawzi.ShopManageMentApp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String getAllCategories(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "category/list";
    }

    @GetMapping("/{id}")
    public String getCategoryById(@PathVariable Long id, Model model) {
        Category category = categoryService.getCategoryById(id);
        model.addAttribute("category", category);
        return "category/details";
    }

    @GetMapping("/create")
    public String showCategoryForm(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "category/create";
    }

    @PostMapping("/create")
    public String createCategory(@ModelAttribute Category category) {
        categoryService.saveCategory(category);
        return "redirect:/categories";
    }

}
