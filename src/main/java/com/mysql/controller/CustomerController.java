package com.mysql.controller;

import com.mysql.model.Customer;
import com.mysql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getDetails/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        return customerService.getCustomerById(id);
    }
}
