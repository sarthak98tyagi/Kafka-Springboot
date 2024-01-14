package com.hustle.kafka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    KafkaTemplate<String,String> kafkaTEmplate;

    public void produceMessage(String topic, String message){
        kafkaTEmplate.send(topic,message);
    }
}
