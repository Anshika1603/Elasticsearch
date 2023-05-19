package com.knoldus.springbootelasticsearch.repository;

import com.knoldus.springbootelasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
}
