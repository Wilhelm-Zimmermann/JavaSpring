package com.devsuperior.course_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course_java.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
