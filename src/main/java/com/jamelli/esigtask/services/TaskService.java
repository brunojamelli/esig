package com.jamelli.esigtask.services;

import com.jamelli.esigtask.domains.Task;
import com.jamelli.esigtask.repositories.TaskRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repo;

	public Task save(Task task) {
		task.setStatus(false);
		return repo.save(task);
	}

	public List<Task> findAll() {
		return repo.findAll();
	}

	public Task findTask(Integer id){
		return repo.findOne(id);
	}

	public void deleteById(Integer id) {
		repo.delete(id);
	}

	public void updateStatus(Integer id) {
		Task task = repo.findOne(id);
		// alterando o status da tarefa para o inverso do que ele é
		task.setStatus(!task.getStatus());
		repo.save(task);
	}

}
