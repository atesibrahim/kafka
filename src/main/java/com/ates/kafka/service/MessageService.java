package com.ates.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private KafkaTemplate<String, String> template;

    @Value(value = "${kafka.message.topic.name}")
    private String kafkaTopic;

    public void publish(String comingMessage) {
        template.send(kafkaTopic,comingMessage);
    }
}
