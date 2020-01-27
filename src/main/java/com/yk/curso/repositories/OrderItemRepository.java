package com.yk.curso.repositories;

import com.yk.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}