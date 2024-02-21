package com.jeansillva.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeansillva.projetospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
