package com.task.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.Task;
import com.task.service.TaskService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TaskController {
	@Autowired
	private TaskService taskService;

	@PostMapping("/addTask")
	public Task addTask(@RequestBody Task task)throws Exception {
		return taskService.addTask(task);
	}
	
	@GetMapping("/getTask")
	public List<Task> getTask() throws Exception {
		return taskService.fetchTaskList();
	}
	
	@PutMapping("/updateTask")
	public Task updategetTask(@RequestBody Task task,Integer taskNo) throws Exception {
		return taskService.updateTask(task,taskNo);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteTask(@PathVariable Long id ){
		  taskService.deleteTask(id);
	}
}
