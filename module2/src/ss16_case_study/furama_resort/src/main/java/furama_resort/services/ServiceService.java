package furama_resort.services;

import furama_resort.models.Service;

import java.util.List;

public interface ServiceService {
    void save(Service service);

    List<Service> getAllService();
}
