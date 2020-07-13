package com.example.thi.repository;

import com.example.thi.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> findAllByIsDeleteIsFalseAndNameCustomerContainingAndCustomerCodeContaining(String name, String type, Pageable pageable);

    Customer findAllByIsDeleteIsFalseAndIdIs(Long id);
}
