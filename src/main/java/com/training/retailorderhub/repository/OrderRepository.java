package com.training.retailorderhub.repository;

import com.training.retailorderhub.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
