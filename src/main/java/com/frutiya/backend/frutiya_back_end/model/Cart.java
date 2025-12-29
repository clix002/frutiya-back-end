package com.frutiya.backend.frutiya_back_end.model;

import java.time.LocalDateTime;

import com.frutiya.backend.frutiya_back_end.domain.RolUsuario;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private RolUsuario role;
    private Boolean state;
    private LocalDateTime createdAt;



}