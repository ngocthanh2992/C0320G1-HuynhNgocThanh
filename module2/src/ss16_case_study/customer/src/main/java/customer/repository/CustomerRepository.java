package customer.repository;

import customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findAllByIsDeleteIsFalse();

    Customer findByIsDeleteIsFalseAndIdIs(Long id);

    Page<Customer> findAllByIsDeleteIsFalse(Pageable pageable);
    Page<Customer> findAllByIsDeleteIsFalseAndAndFirstNameContainingAndLastNameContaining(String firstname,String lastName,Pageable pageable);
}
