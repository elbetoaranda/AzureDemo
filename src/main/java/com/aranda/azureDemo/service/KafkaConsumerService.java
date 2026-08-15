package com.aranda.azureDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService {

    @KafkaListener(topics ="aranda-topic", groupId = "kafka-aranda-group")
    public  void escuchar(String mensaje){
        System.out.println("Mensaje kafka recivido: "+mensaje);
    }
}
