package com.bankofireland.banksystem.service.impl;

import org.springframework.stereotype.Service;

import com.bankofireland.banksystem.model.Customer;
import com.bankofireland.banksystem.repository.CustomerRepository;
import com.bankofireland.banksystem.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

    CustomerRepository customerRepository;

    
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomer(int id) {
        
        return customerRepository.findById(id).get();
    }

    @Override
    public String createCustomer(Customer customer) {
        // TODO Auto-generated method stub
        customerRepository.save(customer);
        return "Successfullt created customer with id : "+ customer.getCustomer_id();

    }
    
}
