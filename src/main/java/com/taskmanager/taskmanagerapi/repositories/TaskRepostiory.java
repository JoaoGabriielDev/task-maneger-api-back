package com.taskmanager.taskmanagerapi.repositories;

import com.taskmanager.taskmanagerapi.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepostiory extends JpaRepository<Task, Long> {
}
