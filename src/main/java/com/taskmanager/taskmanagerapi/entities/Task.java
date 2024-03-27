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

    private LocalDateTime dueDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Task(){

    }
    public Task(Long id, String description, LocalDateTime dueDateTime, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDateTime;
        this.status = status;
    }

}
