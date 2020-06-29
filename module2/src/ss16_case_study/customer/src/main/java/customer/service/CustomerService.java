package customer.service;

import customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void deleteCustomer(Customer customer);
    Page<Customer> getAllCustomer(Pageable pageable);

    Page<Customer> findAllByIsDeleteIsFalseAndFirstNameContainingAndLastNameContaining(String s,String l, Pageable pageable);
}
