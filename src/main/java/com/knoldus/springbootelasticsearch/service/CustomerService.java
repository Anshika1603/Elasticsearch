package com.knoldus.springbootelasticsearch.service;

import com.knoldus.springbootelasticsearch.model.Customer;

public interface CustomerService {
    Iterable<Customer> getCustomers();

    Customer insertCustomer(Customer customer);

    Customer updateCustomer(Customer customer, String id);

    String deleteCustomer(String id);
}
