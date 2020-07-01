package furama_resort.repository;

import furama_resort.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
    List<Service> findAllByIsDeleteIsFalseAndIsStatusIsFalse();




    Page<Service> findAllByIsDeleteIsFalseAndNameServiceContainingAndRentalCostContainingAndNumberOfFloorGreaterThanEqual (String name, String cost, Long floor, Pageable pageable);

    @Query("select s from Service s where s.nameService like %?1% and s.rentalCost like %?2% and s.numberOfFloor >= ?3")
    Page<Service> findBySearch(String name, String cost, Long floor, Pageable pageable);
}
