package furama_resort.services;

import furama_resort.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

public interface CustomerService  {

    void save(Customer customer);

    List<Customer> getAllCustomer();

    Page<Customer> findAllByNameAndTypeCustomerAndBirthday(String name, String type, Date start, Date end, Pageable pageable);
}
