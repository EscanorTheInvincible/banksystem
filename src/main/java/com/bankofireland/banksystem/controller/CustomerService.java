package com.bankofireland.banksystem.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.bankofireland.banksystem.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

@RequestMapping("/customer")
public class CustomerService {
    // @RequestMapping("/getDetails", method=RequestMethod.GET)
    @GetMapping("{id}")
    public Customer getCustomerDetails(String id) {
        return new Customer(123,"A","B","C");
}
}
