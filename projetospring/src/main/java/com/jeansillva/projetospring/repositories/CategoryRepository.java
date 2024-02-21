package com.jeansillva.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeansillva.projetospring.entities.Category;

// @Repository opcional nesse caso
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
