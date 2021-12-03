package com.jamelli.esigtask.controller;

import com.jamelli.esigtask.domains.Task;
import com.jamelli.esigtask.repositories.TaskRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named
@SessionScoped
public class TaskController {

	@Autowired
	private TaskRepository repo;

	private Task task = new Task();
	private List<Task> taskList;
	private String buttonName;

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	@PostConstruct
	public void init() {
		taskList = repo.findAll();
		task = new Task();
	}
	public String initRegister(){
		setButtonName("Cadastrar");
		return "/register-task.xhtml";
	}
	public String insert() {
			task.setStatus(false);
			repo.save(task);
			init();
			return "/index.xhtml";
	}

	public void search(){
		String desc = task.getTitle();
		taskList = repo.find(task.getTitle(), desc, task.getResponsible(), task.getStatus());
		task = new Task();
	}

	public void updateStatus(Task obj) {
		obj.setStatus(!obj.getStatus());
		repo.save(obj);
	}

	public String edit(Task obj) {
		task = repo.findOne(obj.getId());
		setButtonName("Alterar");
		return "/register-task.xhtml";
	}

	public String update() {
		repo.save(task);
		task = new Task();
		return "/index.xhtml";
	}

	public void deleteById(Integer id) {
		repo.delete(id);
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public void clear(){
		task = new Task();
	}

}