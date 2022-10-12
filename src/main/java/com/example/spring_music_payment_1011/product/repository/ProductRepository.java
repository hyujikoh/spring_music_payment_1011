package com.example.spring_music_payment_1011.product.repository;

import com.example.spring_music_payment_1011.product.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
