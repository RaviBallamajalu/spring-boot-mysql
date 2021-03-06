package com.mysql.service;

import com.mysql.model.Customer;
import com.mysql.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
   @Autowired
   private CustomerRepository customerRepository;

    public Customer getCustomerById(Integer id) {
        return customerRepository.getCustomerById(id);
    }
}
