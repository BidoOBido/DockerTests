package com.bido.teste.service;

import java.util.List;

import com.bido.teste.model.MockedValues;
import com.bido.teste.repository.MockedValuesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service()
public class MockedValuesService {

    @Autowired()
    private MockedValuesRepository repository;

    public List<MockedValues> findAll(){
        return Streamable.of(repository.findAll()).toList();
    }

    public List<MockedValues> findInconsitences(){
        return Streamable.of(repository.findInconsistences()).toList();
    }

}
