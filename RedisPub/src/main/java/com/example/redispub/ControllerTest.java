package com.example.redispub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    private final MessagePublisher messagePublisher;

    public ControllerTest(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    @GetMapping("/test")
    public void test() {
        messagePublisher.publishMessage("myChannel", "alo alo");
    }
}
