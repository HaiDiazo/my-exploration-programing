package com.donatelo.crud.example.two.repository;

import com.donatelo.crud.example.two.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
