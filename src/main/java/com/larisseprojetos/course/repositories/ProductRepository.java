package com.larisseprojetos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larisseprojetos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product , Long> {

}
