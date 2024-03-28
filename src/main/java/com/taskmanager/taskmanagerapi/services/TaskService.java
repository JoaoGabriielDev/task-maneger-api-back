package com.taskmanager.taskmanagerapi.services;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.repositories.TaskRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Page<Task> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
    
    public Task findById(Long id){
        Optional<Task> obj = repository.findById(id);
        return obj.get();
    }

    public Task insert(Task obj){
        return obj = repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Task update(Long id, Task obj){
        Task entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Task entity, Task obj) {
        entity.setDescription(obj.getDescription());
        entity.setDueDate(obj.getDueDate());
        entity.setStatus(obj.getStatus());
    }
}

