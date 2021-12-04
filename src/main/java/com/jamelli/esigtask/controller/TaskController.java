package com.jamelli.esigtask.controller;

import com.jamelli.esigtask.domains.Task;
import com.jamelli.esigtask.repositories.TaskRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.jamelli.esigtask.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

@Named
@SessionScoped
public class TaskController {

	@Autowired
	private TaskRepository repo;

	@Autowired
	private TaskService taskService;

	private Task task = new Task();
	private List<Task> taskList;
	private String buttonName = "Cadastrar";

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	@PostConstruct
	public void init() {
		taskList = taskService.findAll();
		task = new Task();
		setButtonName("Cadastrar");
	}

	public String insert() {
//			task.setStatus(false);
//			repo.save(task);
			Task newtask = taskService.save(task);
			init();
			String message = "Tarefa "+ newtask.getTitle() +"\nSalva com Sucesso !!";
			saveMessage( message, "Data saved");
			return "/index.xhtml";
	}

	public void findTask(){
//		taskList = repo.find(task.getTitle(), task.getDescription(), task.getResponsible(), task.getStatus());
		taskList = taskService.findTaskByFields(task);
		task = new Task();
	}

	public void findAll(){
		taskList = taskService.findAll();
	}

	public void updateStatus(Task task) {
		// envia a mensagem de acordo com o resultado do operador ternario
		saveMessage((!task.getStatus()) ? "Concluida" : "Em andamento" ,"");
//		obj.setStatus(!obj.getStatus());
//		repo.save(obj);
		taskService.updateStatus(task);
	}

	public String edit(Task obj) {
//		task = repo.findOne(obj.getId());
		task = taskService.findTask(obj.getId());
		setButtonName("Alterar");
		return "/register-task.xhtml";
	}

	public String update() {
		repo.save(task);
		task = new Task();
		return "/index.xhtml";
	}

	public void deleteById(Integer id) {
		deleteMessage("Tarefa Excluida","");
//		repo.delete(id);
		taskService.deleteById(id);
		findAll();
	}

	public void saveMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void deleteMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
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
