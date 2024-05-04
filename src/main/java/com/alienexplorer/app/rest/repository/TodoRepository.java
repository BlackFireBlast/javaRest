package com.alienexplorer.app.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alienexplorer.app.rest.models.Task;


public interface TodoRepository extends JpaRepository <Task, Long> {

 }
