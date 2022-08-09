package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Clientes;
import com.example.demo.Repository.ClientesRepository;

import java.util.List;

@RestController
class Example {

    @Autowired
    ClientesRepository clientesRepository;

    @RequestMapping("/")
    public @ResponseBody List<Clientes> home(){
        return clientesRepository.findAll();
    }

}