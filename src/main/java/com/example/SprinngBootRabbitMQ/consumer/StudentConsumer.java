package com.example.SprinngBootRabbitMQ.consumer;

import com.example.SprinngBootRabbitMQ.entity.StudentStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.example.SprinngBootRabbitMQ.config.MessagingConst.QUEUE;

@Component
public class StudentConsumer {

    @RabbitListener(queues = QUEUE)
    public void consumeMessageFromQueue(StudentStatus studentStatus) {
        System.out.println(String.format("Message received from Queue: %s", studentStatus));
    }
}
