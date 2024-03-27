package com.taskmanager.taskmanagerapi.services;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.repositories.TaskRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepostiory repostiory;

    public List<Task> findAll(){
        return repostiory.findAll();
    }
    
    public Task findById(Long id){
        Optional<Task> obj = repostiory.findById(id);
        return obj.get();
    }

    public Task insert(Task obj){
        return obj = repostiory.save(obj);
    }

    public void delete(Long id){
        repostiory.deleteById(id);
    }

    public Task update(Long id, Task obj){
        Task entity = repostiory.getReferenceById(id);
        updateData(entity, obj);
        return repostiory.save(entity);
    }

    private void updateData(Task entity, Task obj) {
        entity.setDescription(obj.getDescription());
        entity.setDueDate(obj.getDueDate());
        entity.setStatus(obj.getStatus());
    }
}

