package dev.tadeupinheiro.apibudgettissue.service;

import dev.tadeupinheiro.apibudgettissue.model.ThreadRoll;
import dev.tadeupinheiro.apibudgettissue.repository.ThreadRollRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ThreadRollService {

    final ThreadRollRepository threadRollRepository;

    public ThreadRollService(ThreadRollRepository threadRollRepository) {
        this.threadRollRepository = threadRollRepository;
    }

    public BigDecimal costMetersCalculation (BigDecimal costPriceRoll, double size){

        BigDecimal sizeBd = new BigDecimal(size);
        BigDecimal total = costPriceRoll.divide(sizeBd);
        return total;
    }

    public boolean existsByIdThread (String idName) {
        return threadRollRepository.existsById(idName);
    }

    public Optional<ThreadRoll> findByIdThread (String idName){
        return threadRollRepository.findById(idName);
    }
}
