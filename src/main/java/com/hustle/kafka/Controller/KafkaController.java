package com.hustle.kafka.Controller;


import com.hustle.kafka.Service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    MessageProducer producer;

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestParam("message") String message)
    {
        producer.produceMessage("no-topic",message);
        return new ResponseEntity<>("Message Sent Successfully", HttpStatus.OK);
    }
}
