package com.example.todoapp.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskItem,Long> {
}