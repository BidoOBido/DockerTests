package com.bido.teste.service;

import java.util.List;

import com.bido.teste.kafka.Producer;
import com.bido.teste.model.MockedValues;
import com.bido.teste.repository.MockedValuesRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service()
public class MockedValuesService {

    @Autowired()
    private MockedValuesRepository repository;

    @Autowired
    private Producer producer;

    ObjectMapper objectMapper = new ObjectMapper();

    public List<MockedValues> findAll() {
        return Streamable.of(repository.findAll()).toList();
    }

    public List<MockedValues> findInconsitences() {
        return Streamable.of(repository.findInconsistences()).toList();
    }

    public Boolean sendAllValuesKafka() {

        findAll().forEach(x -> {
            try {
                producer.sendMessage(objectMapper.writeValueAsString(x));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });

        return true;
    }

}
