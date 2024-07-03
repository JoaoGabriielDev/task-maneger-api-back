package com.taskmanager.taskmanagerapi.config;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.entities.enums.TaskStatus;
import com.taskmanager.taskmanagerapi.repositories.TaskRepository;
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
    private TaskRepository taskRepostiory;
    @Override
    public void run(String... args) throws Exception {

    Task task1 = new Task(null, "Escrever e executar testes automatizados para garantir que o código funcione conforme o esperado e não introduza " +
                                              "regressões no aplicativo.", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);

    Task task2 = new Task(null, "Escrever documentação técnica para explicar o funcionamento do código, APIs ou sistemas para colegas de equipe ou " +
                                              "usuários finais.", LocalDateTime.parse("2024-02-20T14:25:00"), TaskStatus.COMPLETED);

    Task task3 = new Task(null, "Refatorar partes do código para torná-lo mais legível, modular e fácil de manter, seguindo as melhores práticas de" +
                                              "desenvolvimento de software.", LocalDateTime.parse("2024-03-05T09:50:00"), TaskStatus.IN_PROGRESS);

    Task task4 = new Task(null, "Revisar e fornecer feedback sobre o código escrito por outros membros da equipe.",
                                                LocalDateTime.parse("2024-02-07T11:36:00"), TaskStatus.COMPLETED);

    Task task5 = new Task(null, "Testar a integração entre diferentes partes do sistema para garantir que elas funcionem corretamente juntas.",
                                                LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);

    Task task6 = new Task(null, "Melhorar a estrutura e a legibilidade do código existente sem alterar o seu comportamento.",
                                                LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.COMPLETED);

    Task task7 = new Task(null, "Implemente os controladores RESTful para expor os endpoints HTTP para manipulação das tarefas.",
                                                LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);

    Task task8 = new Task(null, "Projete o modelo de dados para o sistema, identificando as entidades necessárias e seus relacionamentos.",
                                                LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.COMPLETED);

    Task task9 = new Task(null, "Implemente a paginação e ordenação nos endpoints para lidar com grandes volumes de dados.",
                                                LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.IN_PROGRESS);

    Task task10 = new Task(null, "Adicione validações nos controladores e entidades para garantir a integridade dos dados e o comportamento esperado " +
                                                "do sistema.", LocalDateTime.parse("2024-04-30T12:00:00"), TaskStatus.PENDING);

    taskRepostiory.saveAll(Arrays.asList(task1, task2, task3, task4, task5, task6, task7, task8, task9, task10));
    }
}
