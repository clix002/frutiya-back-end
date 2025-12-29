package com.frutiya.backend.frutiya_back_end.controller;

import com.frutiya.backend.frutiya_back_end.model.Greeting;
import com.frutiya.backend.frutiya_back_end.repo.RGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CGreeting {
    @Autowired
    private RGreeting db;

    @GetMapping("/listar")
    public List<Greeting> getAllGreeting (){
        return db.findAll();
    }


}
