package com.sai.rabbitmqconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "queue.A")
    private void receive(String message){
        log.info("Message received from QUEUE A -> {}", message);
    }

    @RabbitListener(queues = "queue.B")
    private void receiveB(String message){
        log.info("Message received from QUEUE B -> {}", message);
    }

    @RabbitListener(queues = "queue.all")
    private void receiveAll(String message){
        log.info("Message received from ALL QUEUES -> {}", message);
    }

}
