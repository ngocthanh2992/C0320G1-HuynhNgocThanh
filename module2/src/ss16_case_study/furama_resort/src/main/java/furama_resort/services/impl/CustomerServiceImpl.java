package furama_resort.services.impl;


import furama_resort.models.Customer;
import furama_resort.repository.CustomerRepository;
import furama_resort.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void save(Customer customer) {
        customer.setDelete(false);
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public Page<Customer> findAllByNameAndTypeCustomerAndBirthday(String name, String type, Date start, Date end, Pageable pageable) {
        return customerRepository.findAllByIsDeleteIsFalseAndNameContainingAndTypeCustomerContainingAndAndBirthdayBetween(name, type, start, end, pageable);
    }
}
