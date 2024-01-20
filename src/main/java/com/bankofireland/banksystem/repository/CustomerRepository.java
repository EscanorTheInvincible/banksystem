package com.bankofireland.banksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankofireland.banksystem.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}