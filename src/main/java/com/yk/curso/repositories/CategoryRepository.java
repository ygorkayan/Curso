package com.yk.curso.repositories;

import com.yk.curso.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}