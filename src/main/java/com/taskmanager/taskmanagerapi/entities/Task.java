package com.taskmanager.taskmanagerapi.entities;

import com.taskmanager.taskmanagerapi.entities.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_task")
@Data
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String code;

    private LocalDateTime dueDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Task(Task data){

    }
    public Task(Long id, String description, String code, LocalDateTime dueDateTime, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.code = code;
        this.dueDate = dueDateTime;
        this.status = status;
    }

}
