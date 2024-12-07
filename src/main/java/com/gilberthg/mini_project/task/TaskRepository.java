package com.gilberthg.mini_project.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskData, Long> {

}
