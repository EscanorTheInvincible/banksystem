package com.bankofireland.banksystem.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.bankofireland.banksystem.model.Customer;
import com.bankofireland.banksystem.service.CustomerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController

@RequestMapping("/customer")
public class CustomerController {
    
    CustomerService customerService;
    

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    // Get Customer Details
    @GetMapping("{id}")
    public Customer getCustomerDetails(@PathVariable("id") int id) {
        
        return customerService.getCustomer(id);
}
    // Create Customer
    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        //TODO: process POST request
        
        return customerService.createCustomer(customer);
    }

    // TODO
    // Update API 

    //TODO
    // Delete API
    
}
