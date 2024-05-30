package com.alkewallet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alkewallet.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta,Integer> {
	
}
