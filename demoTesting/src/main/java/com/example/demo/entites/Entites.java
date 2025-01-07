package com.example.demo.entites;

public class Entites 
{
	private  Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entites(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Entites() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
