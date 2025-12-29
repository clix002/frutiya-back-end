package com.frutiya.backend.frutiya_back_end.repo;

import com.frutiya.backend.frutiya_back_end.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RGreeting extends JpaRepository<Greeting, Long> {
}