package com.bido.teste.controller;

import java.util.List;

import com.bido.teste.model.MockedValues;
import com.bido.teste.service.MockedValuesService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/values")
@EnableScheduling
public class MockedValuesController {

    private static final Logger log = LoggerFactory.getLogger(MockedValuesController.class);

    @Autowired
    private MockedValuesService service;

    @GetMapping()
    public ResponseEntity<List<MockedValues>> getAllValues() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/inconsistences")
    public ResponseEntity<List<MockedValues>> getInconsistences() {
        return ResponseEntity.ok(service.findInconsitences());  
    }

    @Scheduled(fixedDelay = 5000)
    public void ScheduleTest(){
        log.info("Work");
    }

}
