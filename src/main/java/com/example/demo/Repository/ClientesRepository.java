package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Clientes;

public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
    List<Clientes> findAll();
}
