package com.monedero.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    // getters and setters
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}

