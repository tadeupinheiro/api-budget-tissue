package dev.tadeupinheiro.apibudgettissue.service;

import dev.tadeupinheiro.apibudgettissue.model.StripReflectiveConsumption;
import dev.tadeupinheiro.apibudgettissue.repository.StripReflectiveRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StripReflectiveConsumptionService {

    final StripReflectiveRepository stripReflectiveRepository;

    public StripReflectiveConsumptionService(StripReflectiveRepository stripReflectiveRepository) {
        this.stripReflectiveRepository = stripReflectiveRepository;
    }

    public boolean existsByIdStripReflective (Integer idStripReflective){
        return this.stripReflectiveRepository.existsById(idStripReflective);
    }

    @Transactional
    public StripReflectiveConsumption saveStripReflectiveConsumption (StripReflectiveConsumption stripReflectiveConsumption){
        this.stripReflectiveRepository.save(stripReflectiveConsumption);
        return stripReflectiveConsumption;
    }
}
