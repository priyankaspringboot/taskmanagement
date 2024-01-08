package com.task.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.task.entity.Task;
import com.task.repository.TaskRepository;
import com.task.service.TaskService;

@Service
public class TaskServiceimple implements TaskService {

	@Autowired
	public TaskRepository taskrespository;

	@Override
	public Task addTask(Task object) {
		// TODO Auto-generated method stub
		return taskrespository.save(object);
	}

	@Override
	public List<Task> fetchTaskList() {
		
		return taskrespository.findAll();
	}

	@Override
	public Task updateTask(Task task,Integer taskNo) {
		Task taskobj = new Task();
		Optional<Task> taskDetails = taskrespository.findByTaskNo(taskNo);
		
		if(taskDetails.isPresent()) {
			
			taskobj.setCreationDate(taskDetails.get().getCreationDate());
			taskobj.setEmpId(taskDetails.get().getEmpId());
			taskobj.setEmpName(taskDetails.get().getEmpName());		
			taskobj.setAssignTo(taskDetails.get().getAssignTo());
			taskobj.setTaskName(taskDetails.get().getTaskName());
			taskobj.setTaskNo(taskDetails.get().getTaskNo());
			
			taskobj.setStartDate(task.getStartDate());
			taskobj.setStatus(task.getStatus());
			taskobj.setEndDate(task.getEndDate());
			
			return taskrespository.saveAndFlush(task);
		}
		
		
		return taskrespository.saveAndFlush(taskobj);
		
	} 

	public void deleteTask(Long id) {
		 taskrespository.deleteById(id);
		
	}
	
	
	
	
	
}
