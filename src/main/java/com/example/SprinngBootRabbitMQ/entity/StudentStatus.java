package com.example.SprinngBootRabbitMQ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentStatus {
    private Student student;
    /* Status can be in progress or completed . It represents the Response of the Queue */
    private String status;
    private String message;
}
