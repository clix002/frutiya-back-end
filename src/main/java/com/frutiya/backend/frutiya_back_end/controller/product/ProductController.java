package com.frutiya.backend.frutiya_back_end.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frutiya.backend.frutiya_back_end.model.Products;
import com.frutiya.backend.frutiya_back_end.repo.ProductsRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductsRepository db;

    public ResponseEntity<Page<Products>>  getAllProducts(Pageable pageable){
        Page<Products> products = db.findByState(true, pageable);
        return ResponseEntity.ok(products);
    }

}
