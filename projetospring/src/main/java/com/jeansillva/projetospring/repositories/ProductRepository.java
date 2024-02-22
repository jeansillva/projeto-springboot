package com.jeansillva.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeansillva.projetospring.entities.Product;

// @Repository opcional nesse caso
public interface ProductRepository extends JpaRepository<Product, Long> {

}
