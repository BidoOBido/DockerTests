package com.bido.kafkaproducer.controller;

import java.util.List;

import com.bido.kafkaproducer.model.MockedValues;
import com.bido.kafkaproducer.service.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/values")
@EnableScheduling
public class ProducerController {

    @Autowired
    private ProducerService service;

    @GetMapping()
    public ResponseEntity<List<MockedValues>> getAllValues() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/inconsistences")
    public ResponseEntity<List<MockedValues>> getInconsistences() {
        return ResponseEntity.ok(service.findInconsitences());
    }

    @GetMapping(value = "/sendAllValuesKafka")
    public ResponseEntity<Boolean> sendAllValuesKafka() {
        return ResponseEntity.ok(service.sendAllValuesKafka());
    }

    // @Scheduled(fixedDelay = 5000)
    // public void ScheduleTest(){
    // log.info("Work");
    // }

}
