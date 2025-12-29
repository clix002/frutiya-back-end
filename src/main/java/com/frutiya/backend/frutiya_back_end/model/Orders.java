package com.frutiya.backend.frutiya_back_end.model;

import java.sql.Date;
import com.frutiya.backend.frutiya_back_end.domain.EstadoPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer costomerId;
    private Integer deliveryPersonId;
    @Enumerated(EnumType.STRING)
    private EstadoPedido status;
    private Date orderDate;
}