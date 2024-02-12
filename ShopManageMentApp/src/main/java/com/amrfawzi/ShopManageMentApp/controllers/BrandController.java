package com.amrfawzi.ShopManageMentApp.controllers;

import com.amrfawzi.ShopManageMentApp.models.Brand;
import com.amrfawzi.ShopManageMentApp.models.Category;
import com.amrfawzi.ShopManageMentApp.models.Product;
import com.amrfawzi.ShopManageMentApp.services.BrandService;
import com.amrfawzi.ShopManageMentApp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public String getAllBrands(Model model) {
        List<Brand> brands = brandService.getAllBrands();
        model.addAttribute("brands", brands);
        return "brand/list";
    }

    @GetMapping("/{id}")
    public String getBrandById(@PathVariable Long id, Model model) {
        Brand brand = brandService.getBrandById(id);
        model.addAttribute("brand", brand);
        return "brand/details";
    }

    @GetMapping("/create")
    public String showBrandForm(Model model) {
        Brand brand = new Brand();
        model.addAttribute("brand", brand);
        return "brand/create";
    }

    @PostMapping("/create")
    public String createBrand(@ModelAttribute Brand brand) {
        brandService.saveBrand(brand);
        return "redirect:/brands";
    }

}
