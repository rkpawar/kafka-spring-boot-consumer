package com.ran.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class Consumer {


    @KafkaListener(topics = "quickstart-events")
    public void processMessage(String order){
        System.out.println("Message received: " + order);
    }
}