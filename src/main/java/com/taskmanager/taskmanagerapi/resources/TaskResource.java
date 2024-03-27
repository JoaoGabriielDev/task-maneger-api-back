package com.taskmanager.taskmanagerapi.resources;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

    private TaskService service;

    @GetMapping
    public ResponseEntity<List<Task>> findAll(){
        List<Task> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
