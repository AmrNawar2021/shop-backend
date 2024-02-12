package com.amrfawzi.ShopManageMentApp.repositories;

import com.amrfawzi.ShopManageMentApp.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}

