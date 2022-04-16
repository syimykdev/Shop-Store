package com.example.legacy.repositories;

import com.example.legacy.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}