package customer.service.impl;

import customer.model.Customer;
import customer.repository.CustomerRepository;
import customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customer.setDelete(false);
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findByIsDeleteIsFalseAndIdIs(id);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customer.setDelete(true);
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> getAllCustomer(Pageable pageable) {
        return customerRepository.findAllByIsDeleteIsFalse(pageable);
    }

    @Override
    public Page<Customer> findAllByIsDeleteIsFalseAndFirstNameContainingAndLastNameContaining(String s,String l, Pageable pageable) {
        return customerRepository.findAllByIsDeleteIsFalseAndAndFirstNameContainingAndLastNameContaining(s,l,pageable);
    }
}
