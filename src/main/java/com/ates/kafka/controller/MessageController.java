package com.ates.kafka.controller;

import com.ates.kafka.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("messages")
public class MessageController {

    private final MessageService messageService;

    @PutMapping
    public void publish(@RequestBody String message) {
        messageService.publish(message);
    }
}
