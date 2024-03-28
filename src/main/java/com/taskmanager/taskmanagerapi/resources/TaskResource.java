package com.taskmanager.taskmanagerapi.resources;

import com.taskmanager.taskmanagerapi.entities.Task;
import com.taskmanager.taskmanagerapi.services.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.data.domain.Pageable;
import java.net.URI;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

    @Autowired
    private TaskService service;

    @GetMapping
    public ResponseEntity<Page<Task>> findAll(Pageable pageable){
        Page<Task> page = service.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> findById(@PathVariable Long id){
        Task obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<Task> insert(@Valid @RequestBody Task obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @Valid @RequestBody Task obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
