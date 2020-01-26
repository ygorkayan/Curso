package com.yk.curso.resources;

import com.yk.curso.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserResource
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1l, "ygor", "ygorkayan...", "123", "abc123");
        return ResponseEntity.ok().body(u);
    } 
    
}