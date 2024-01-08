package com.task.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.task.entity.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	@Query(value= "select * from Task where task_no=:taskNo", nativeQuery = true)
	Optional<Task> findByTaskNo(@Param("taskNo") Integer taskNo);

}
