package com.amrfawzi.ShopManageMentApp.serviceimpl;

import com.amrfawzi.ShopManageMentApp.models.Brand;
import com.amrfawzi.ShopManageMentApp.repositories.BrandRepository;
import com.amrfawzi.ShopManageMentApp.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(Long id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }


}

