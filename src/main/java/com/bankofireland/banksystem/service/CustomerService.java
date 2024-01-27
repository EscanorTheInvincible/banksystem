package com.bankofireland.banksystem.service;

import com.bankofireland.banksystem.model.Customer;

public interface CustomerService {

    public Customer getCustomer(int id);
    public String createCustomer(Customer customer);
    public String deleteCustomerDetails(int id);
    public String updateCustomerDetails(Customer customer);
    //TODO
    
} 
