package com.bido.kafkaconsumer.kafka;

import com.bido.kafkaconsumer.model.MockedValues;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(Consumer.class);
    private static final String TOPIC = "inconsistences";

    ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = TOPIC)
    public void consume(@Payload String value) {
        try {
            log.info("Consumed value = " + objectMapper.readValue(value, MockedValues.class).toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
