package com.devsuperior.course_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course_java.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
