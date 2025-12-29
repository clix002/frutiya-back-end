package com.frutiya.backend.frutiya_back_end.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.frutiya.backend.frutiya_back_end.domain.EstadoPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User customer;
    private User deliveryPerson;
    @Enumerated(EnumType.STRING)
    private EstadoPedido status;
    private Integer stock;
    private Boolean state;
    private LocalDateTime createdAt;



}