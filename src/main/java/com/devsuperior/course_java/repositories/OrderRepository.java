package com.devsuperior.course_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course_java.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
