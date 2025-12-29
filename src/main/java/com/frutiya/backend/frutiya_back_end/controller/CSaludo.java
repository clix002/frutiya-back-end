package com.frutiya.backend.frutiya_back_end.controller;

import com.frutiya.backend.frutiya_back_end.model.Saludo;
import com.frutiya.backend.frutiya_back_end.repo.RSaludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController6
public class CSaludo {

    @Autowired
    private RSaludo cSaludo;


    @GetMapping("/Lis")
    public List<Saludo> listar(){
        return cSaludo.findAll();
    }
}
