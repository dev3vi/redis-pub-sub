package com.example.redispub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {


    @Bean
    RedisTemplate< String, Object > redisTemplate(RedisConnectionFactory connectionFactory) {
        final RedisTemplate< String, Object > template =  new RedisTemplate< String, Object >();
        template.setConnectionFactory(connectionFactory);
        return template;
    }

}
