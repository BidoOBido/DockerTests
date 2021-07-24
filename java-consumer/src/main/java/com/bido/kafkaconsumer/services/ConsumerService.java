package com.bido.kafkaconsumer.services;

import com.bido.kafkaconsumer.enumerator.InconsitenceType;
import com.bido.kafkaconsumer.model.Inconsistences;
import com.bido.kafkaconsumer.model.MockedValues;
import com.bido.kafkaconsumer.repository.InconsistencesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class ConsumerService {

    @Autowired
    private InconsistencesRepository repository;

    public void insertInconsistence(MockedValues value){
        Inconsistences inconsistence = new Inconsistences(value.getCreatedOn(), InconsitenceType.INCONSITENT_VALUE.getFlag(), value.toString());

        repository.save(inconsistence);
    }
}
