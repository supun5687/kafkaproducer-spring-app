package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/publish")
    public String sendMessageToKafka(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka successfully";
    }
}
