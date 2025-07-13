package com.vik.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

import com.vik.model.Message;

@Controller
public class MessageConsumer {

    @KafkaListener(topics = "demo_topic", groupId = "demo-group")
    public void consume(Message message) {
        System.out.println("Consumed message: " + message);
    }
}
