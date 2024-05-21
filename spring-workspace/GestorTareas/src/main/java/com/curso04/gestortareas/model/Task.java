package com.curso04.gestortareas.model;

public class Task {
	
	private String title;
	private boolean completed;
	
	public Task(String title, boolean completed) {
		super();
		this.title = title;
		this.completed = completed;
	}
	
	public Task() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	

}
