package com.example.redispub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void publishMessage(String channel, String message) {
        redisTemplate.convertAndSend(channel, message);
        System.out.println("Message published to " + channel + ": " + message);
    }
}