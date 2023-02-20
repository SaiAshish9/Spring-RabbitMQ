package com.sai.rabbitmqproducer.controller;

import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/{message}")
    public String send(@PathVariable(value = "message") String message){
//        MessageProperties messageProperties = new MessageProperties();
//        messageProperties.setHeader("colour", message);
//        MessageConverter messageConverter = new SimpleMessageConverter();
//        Message message1 = messageConverter.toMessage(message, messageProperties);
//        rabbitTemplate.send(exchange.getName(), "", message1);
//        rabbitTemplate.convertAndSend(exchange.getName(), ROUTING_A, message);
          rabbitTemplate.convertAndSend("queue.A", message);
        return "Message sent";
    }

}
