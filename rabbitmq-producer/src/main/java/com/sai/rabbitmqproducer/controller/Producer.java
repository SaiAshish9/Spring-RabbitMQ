package com.sai.rabbitmqproducer.controller;

import com.sai.rabbitmqproducer.model.Message;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.sai.rabbitmqproducer.config.RabbitMQConfiguration.ROUTING_A;

@RestController
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DirectExchange exchange;

    @PostMapping("/")
    public String send(@RequestBody Message message){
        rabbitTemplate.convertAndSend(exchange.getName(), ROUTING_A, message);
        return "Message sent";
    }

}
