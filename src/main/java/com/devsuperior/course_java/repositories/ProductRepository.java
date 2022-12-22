package com.devsuperior.course_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course_java.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
