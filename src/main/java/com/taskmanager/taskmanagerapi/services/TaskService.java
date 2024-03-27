package com.taskmanager.taskmanagerapi.services;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.repositories.TaskRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepostiory repostiory;

    public List<Task> findAll(){
        return repostiory.findAll();
    }
}

