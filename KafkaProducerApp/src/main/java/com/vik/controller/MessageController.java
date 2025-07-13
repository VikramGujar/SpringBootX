package com.vik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vik.model.Message;
import com.vik.producer.MessageProducer;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageProducer producer;

    @PostMapping
    public String sendMessage(@RequestBody Message message) {
        producer.sendMessage(message);
        return "Message sent to Kafka!";
    }
}