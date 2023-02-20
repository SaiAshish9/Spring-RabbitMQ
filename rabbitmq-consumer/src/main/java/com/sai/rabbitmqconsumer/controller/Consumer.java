package com.sai.rabbitmqconsumer.controller;

import com.sai.rabbitmqconsumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "queue.A")
    private void receive(Message message){
        log.info("Message received from QUEUE A -> {}", message);
    }

    @RabbitListener(queues = "queue.B")
    private void receiveB(Message message){
        log.info("Message received from QUEUE B -> {}", message);
    }

}
