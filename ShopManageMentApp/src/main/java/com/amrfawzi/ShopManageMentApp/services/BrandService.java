package com.amrfawzi.ShopManageMentApp.services;

import com.amrfawzi.ShopManageMentApp.models.Brand;
import com.amrfawzi.ShopManageMentApp.models.Product;

import java.util.List;

// ProductService.java
public interface BrandService {
    List<Brand> getAllBrands();
    Brand getBrandById(Long id);
    void saveBrand(Brand brand);

}
