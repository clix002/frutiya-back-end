package com.frutiya.backend.frutiya_back_end.repo;

import com.frutiya.backend.frutiya_back_end.model.Saludo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSaludo extends JpaRepository <Saludo, Long> {
}
