package com.example.thi.service;

import com.example.thi.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAllByNameAndTypeCustomer(String name, String type, Pageable pageable);

    Customer getCustomerById(Long id);

    void save(Customer customer);

    void deleteCustomer(Customer customer);
}
