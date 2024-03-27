package com.taskmanager.taskmanagerapi.config;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.entities.enums.TaskStatus;
import com.taskmanager.taskmanagerapi.repositories.TaskRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TaskRepostiory taskRepostiory;
    @Override
    public void run(String... args) throws Exception {

    Task task1 = new Task(null, "otimizar o sistema de listagem de usuario", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);

    taskRepostiory.saveAll(Arrays.asList(task1));

    }
}
