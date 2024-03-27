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

    Task task1 = new Task(null, "Escrever e executar testes automatizados para garantir que o código funcione conforme o esperado e não introduza " +
                                              "regressões no aplicativo.", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);
    Task task2 = new Task(null, "Escrever documentação técnica para explicar o funcionamento do código, APIs ou sistemas para colegas de equipe ou " +
                                              "usuários finais.", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.COMPLETED);
    Task task3 = new Task(null, "Refatorar partes do código para torná-lo mais legível, modular e fácil de manter, seguindo as melhores práticas de" +
                                              "desenvolvimento de software.", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.IN_PROGRESS);

    taskRepostiory.saveAll(Arrays.asList(task1, task2, task3));
    }
}
