package com.example.SprinngBootRabbitMQ.producer;

import com.example.SprinngBootRabbitMQ.entity.Student;
import com.example.SprinngBootRabbitMQ.entity.StudentStatus;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.SprinngBootRabbitMQ.config.MessagingConst.EXCHANGE;
import static com.example.SprinngBootRabbitMQ.config.MessagingConst.ROUTING_KEY;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentProducer {
    private RabbitTemplate rabbitTemplate;

    @PostMapping
    public void saveStudent(@RequestBody Student student) {
        /* For Example: Asynchronous Computation of the Student in other Services */

        /* Creating and Sending a Message to the Queue */
        StudentStatus studentStatus = new StudentStatus(student, "PROCESS", "Student received successfully");
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, studentStatus);
    }
}
