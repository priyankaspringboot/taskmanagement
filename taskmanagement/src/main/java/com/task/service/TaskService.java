package com.task.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.task.entity.Task;

@Component
public interface TaskService {

    Task addTask(Task object);
	
	List<Task> fetchTaskList();
	
	Task updateTask(Task task,Integer taskNo);
	
	void deleteTask (Long id);
	
	
	
}
