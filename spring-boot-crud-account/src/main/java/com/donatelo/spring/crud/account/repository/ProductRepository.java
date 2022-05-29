package com.donatelo.spring.crud.account.repository;

import com.donatelo.spring.crud.account.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
