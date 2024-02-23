package com.jeansillva.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeansillva.projetospring.entities.OrderItem;
import com.jeansillva.projetospring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}