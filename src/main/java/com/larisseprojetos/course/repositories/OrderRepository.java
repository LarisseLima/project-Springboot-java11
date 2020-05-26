package com.larisseprojetos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larisseprojetos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
