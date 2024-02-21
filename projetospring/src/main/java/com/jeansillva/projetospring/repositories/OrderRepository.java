package com.jeansillva.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeansillva.projetospring.entities.Order;

// @Repository opcional nesse caso
public interface OrderRepository extends JpaRepository<Order, Long> {

}
