package com.knoldus.springbootelasticsearch.service.impl;

import com.knoldus.springbootelasticsearch.model.Customer;
import com.knoldus.springbootelasticsearch.repository.CustomerRepository;
import com.knoldus.springbootelasticsearch.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Customer insertCustomer(Customer customer){
            return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer, String id){
        Customer customer1= customerRepository.findById(id).get();
        customer1.setFirstname(customer.getFirstname());
        customer1.setLastname(customer.getLastname());
        customer1.setAge(customer.getAge());
        return customer1;
    }

    public String deleteCustomer(String id){
        customerRepository.deleteById(id);
        return "Record Deleted!";
    }
}
