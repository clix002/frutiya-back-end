package com.frutiya.backend.frutiya_back_end.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.frutiya.backend.frutiya_back_end.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
 Page<Products>findByState(Boolean state, Pageable pageable);
}
