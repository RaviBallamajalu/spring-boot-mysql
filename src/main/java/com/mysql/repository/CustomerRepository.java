package com.mysql.repository;

import com.mysql.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    Customer getCustomerById(Integer id);
}
