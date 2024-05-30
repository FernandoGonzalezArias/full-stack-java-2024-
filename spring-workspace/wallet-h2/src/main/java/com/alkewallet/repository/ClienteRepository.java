package com.alkewallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alkewallet.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
