package com.curso04.gestortareas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso04.gestortareas.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class TaskController {
	
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	@GetMapping("/")
	public String index(Model model) {
		
		//SIMULAMOS LA CREACION DE UNA TAREA PARA DEVOLVERLA
		logger.debug("Este es un mensaje de nivel debug");
		logger.info("este es un logger de info ");
		logger.warn("este es un warning");
		logger.error("este es error");
		
		List<Task> taskList = new ArrayList<>();
		Task task1 = new Task("Hacer modulo 2", false);
		Task task2 = new Task("Hacer modulo 3", false);
		Task task3 = new Task("Hacer modulo 4", true);
		Task task4 = new Task("Hacer modulo 5", false);
		Task task5 = new Task("Hacer modulo 6", true);
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);
		
		model.addAttribute("tasks", taskList);
		return "index";
	}

}
