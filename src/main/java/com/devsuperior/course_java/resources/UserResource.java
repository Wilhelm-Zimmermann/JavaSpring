package com.devsuperior.course_java.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.course_java.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		var user = new User(1L, "Joseph", "joseph@gmail.com", "12930810", "passwordStrong");
		return ResponseEntity.ok().body(user);
	}
}
