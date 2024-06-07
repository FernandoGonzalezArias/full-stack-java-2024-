package com.monedero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monedero.modelos.Transaction;
import com.monedero.modelos.User;
import com.monedero.repository.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    
    public List<Transaction> findByUser(User user) {
        return transactionRepository.findByUser(user);
    }
    
    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}

