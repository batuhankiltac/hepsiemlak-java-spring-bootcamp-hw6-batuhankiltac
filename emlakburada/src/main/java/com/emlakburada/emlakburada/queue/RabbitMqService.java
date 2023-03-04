package com.emlakburada.emlakburada.queue;

import com.emlakburada.emlakburada.config.RabbitMqConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMqService implements QueueService {
    private final AmqpTemplate rabbitTemplate;
    private final RabbitMqConfig config;

    @Override
    public void sendMessage(String email) {
        rabbitTemplate.convertAndSend(config.getExchange(), config.getRoutingkey(), email);
    }
}