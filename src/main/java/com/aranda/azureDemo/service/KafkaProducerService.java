package com.aranda.azureDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void enviarMensaje(String topico, String mensaje){
        kafkaTemplate.send(topico, mensaje);
    }
}
