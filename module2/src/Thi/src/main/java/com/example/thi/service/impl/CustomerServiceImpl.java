package com.example.thi.service.impl;

import com.example.thi.model.Customer;
import com.example.thi.repository.CustomerRepository;
import com.example.thi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAllByNameAndTypeCustomer(String name, String type, Pageable pageable) {
        return customerRepository.findAllByIsDeleteIsFalseAndNameCustomerContainingAndCustomerCodeContaining(name,type,pageable);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findAllByIsDeleteIsFalseAndIdIs(id);
    }

    @Override
    public void save(Customer customer) {
        customer.setDelete(false);
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customer.setDelete(true);
        customerRepository.save(customer);
    }
}
