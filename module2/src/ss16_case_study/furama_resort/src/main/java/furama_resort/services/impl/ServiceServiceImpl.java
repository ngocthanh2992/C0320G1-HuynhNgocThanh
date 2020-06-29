package furama_resort.services.impl;

import furama_resort.repository.ServiceRepository;
import furama_resort.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;


    @Override
    public void save(furama_resort.models.Service service) {
        service.setStatus(false);
        service.setDelete(false);
        serviceRepository.save(service);
    }

    @Override
    public List<furama_resort.models.Service> getAllService() {
        return serviceRepository.findAllByIsDeleteIsFalseAndIsStatusIsFalse();
    }
}
