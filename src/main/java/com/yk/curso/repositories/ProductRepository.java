package com.yk.curso.repositories;

import com.yk.curso.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}