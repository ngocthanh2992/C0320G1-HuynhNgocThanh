package furama_resort.services.impl;

import furama_resort.models.Contract;
import furama_resort.repository.ContractRepository;
import furama_resort.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    ContractRepository contractRepository;

    @Override
    public void save(Contract contract) {
        contract.setDelete(false);
        contractRepository.save(contract);
    }
}
