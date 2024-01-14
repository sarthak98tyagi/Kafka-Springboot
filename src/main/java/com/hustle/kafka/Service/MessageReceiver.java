package com.hustle.kafka.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    private static final Logger log = LoggerFactory.getLogger(MessageReceiver.class);

    @KafkaListener(topics ="no-topic", groupId = "no-group")
    public void listen(String message){
        log.info("Message received: "+message);
    }
}
