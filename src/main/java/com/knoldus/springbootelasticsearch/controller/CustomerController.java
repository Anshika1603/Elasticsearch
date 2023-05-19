package com.knoldus.springbootelasticsearch.controller;

import com.knoldus.springbootelasticsearch.model.Customer;
import com.knoldus.springbootelasticsearch.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/findAll")
    Iterable<Customer> findAll(){
        return customerService.getCustomers();
    }

    @PostMapping("/insert")
    public Customer insertCustomer(@RequestBody Customer customer){
        return customerService.insertCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable String id){
        return customerService.deleteCustomer(id);
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id){
        return customerService.updateCustomer(customer,id);
    }

}
