package com.monedero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monedero.modelos.Transaction;
import com.monedero.modelos.User;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}

