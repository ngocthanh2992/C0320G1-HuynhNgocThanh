package furama_resort.repository;

import furama_resort.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
    List<Service> findAllByIsDeleteIsFalseAndIsStatusIsFalse();
}
