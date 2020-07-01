package furama_resort.services;

import furama_resort.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    void save(Service service);

    List<Service> getAllService();

    Page<Service> findAllByNameAndCostAndNumber(String name, String cost, Long floor, Pageable pageable);
}
