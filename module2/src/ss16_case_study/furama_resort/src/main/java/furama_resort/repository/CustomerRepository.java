package furama_resort.repository;

import furama_resort.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByIsDeleteIsFalse();

    Page<Customer> findAllByIsDeleteIsFalseAndNameContainingAndTypeCustomerContainingAndAndBirthdayBetween(String name, String type, Date start, Date end, Pageable pageable);
}
