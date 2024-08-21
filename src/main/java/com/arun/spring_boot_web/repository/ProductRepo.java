package com.arun.spring_boot_web.repository;

import com.arun.spring_boot_web.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {


}
