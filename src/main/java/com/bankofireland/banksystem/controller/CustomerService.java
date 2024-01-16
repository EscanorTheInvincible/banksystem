package com.bankofireland.banksystem.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.bankofireland.banksystem.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController

@RequestMapping("/customer")
public class CustomerService {
    
    // Get Customer Details
    @GetMapping("{id}")
    public Customer getCustomerDetails(String id) {
        return new Customer(123,"A","B","C");
}
    // Create Customer
    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        //TODO: process POST request
        Customer c1 = customer;
        return "Customer Created with id "+ c1.getCustomer_id();
    }

    // TODO
    // Update API 

    //TODO
    // Delete API
    
}
