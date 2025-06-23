package com.jsp.flipzon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.flipzon.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
