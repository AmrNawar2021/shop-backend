package com.amrfawzi.ShopManageMentApp.repositories;

import com.amrfawzi.ShopManageMentApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

