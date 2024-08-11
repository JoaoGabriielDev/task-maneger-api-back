package com.taskmanager.taskmanagerapi.services;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.entities.enums.TaskStatus;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.Optional;

@DataJpaTest
@ActiveProfiles("test")
class TaskServiceTest {

    @Autowired
    TaskService taskService;

    @Autowired
    EntityManager entityManager;
    private Long code;

    @Test
    @DisplayName("Should get Tasl sucessfully from DB")
    void findAll() {
        String id = "234";
        Task data = new Task(null, "Escrever e executar testes automatizados para garantir que o código funcione conforme o esperado e não introduza " +
                "regressões no aplicativo.", "234", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);
        this.createTask(data);

        Task result = this.taskService.findById(code);

        assertThat(result.isPresent()).isTrue();
    }

    @Test
    void findByIdCase1() {
        
    }

    private Task createTask(Task data){
        Task newTask = new Task(data);
        this.entityManager.persist(newTask);
        return newTask;
    }


}