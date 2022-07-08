package com.ates.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @KafkaListener(topics = "${kafka.message.topic.name}", groupId = "${kafka.message.groupId")
    public void listenMessage(String message) {
        log.info("Received Message: " + message);
    }
}
