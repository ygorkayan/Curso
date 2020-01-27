package com.yk.curso.repositories;

import com.yk.curso.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}