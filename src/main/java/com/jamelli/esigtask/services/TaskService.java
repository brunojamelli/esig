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

	public Task insert(Task obj) {
		obj.setId(null);
		obj.setStatus(false);
		obj = repo.save(obj);
		return obj;
	}

	public List<Task> findAll() {
		return repo.findAll();
	}

	public List<Task> findAllByStatus(Boolean b) {
		return repo.findByStatus(b);
	}

	public void deleteById(Integer id) {
		repo.delete(id);
	}

	public void updateStatus(Integer id) {
		Task obj = repo.findOne(id);
		obj.setStatus((!obj.getStatus()) ? true : false);
		repo.save(obj);
	}

}
