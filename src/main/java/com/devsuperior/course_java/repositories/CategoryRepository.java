package com.devsuperior.course_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course_java.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
