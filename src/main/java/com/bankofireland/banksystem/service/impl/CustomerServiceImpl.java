package com.bankofireland.banksystem.service.impl;

import org.springframework.stereotype.Service;

import com.bankofireland.banksystem.exception.CustomerNotFoundException;
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
        if(customerRepository.findById(id).isEmpty()){
            throw new CustomerNotFoundException("Customer does not exist");
        }
        return customerRepository.findById(id).get();
    }

    @Override
    public String createCustomer(Customer customer) {
        // TODO Auto-generated method stub
        customerRepository.save(customer);
        return "Successfullt created customer with id : "+ customer.getCustomer_id();

    }

    @Override
    public String deleteCustomerDetails(int id) {
        // TODO Auto-generated method stub
        customerRepository.deleteById(id);
        return "Successfullt deleted customer with id : "+ id;

    }
    
    @Override
    public String updateCustomerDetails(Customer customer) {
        // TODO Auto-generated method stub
        if(customerRepository.findById(customer.getCustomer_id()).isEmpty()) {
                    customerRepository.save(customer);
                return "Custmoer was not present so created new data :"+ customer.getCustomer_id();
    }
        else 
        customerRepository.save(customer);
        return "Custmoer was present and updated successfully :"+ customer.getCustomer_id();

}
}
