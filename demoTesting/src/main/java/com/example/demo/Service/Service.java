package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.entites.Entites;

@org.springframework.stereotype.Service
public class Service
{
	Logger logger= LoggerFactory.getLogger(Service.class);
	List<Entites> todo= new ArrayList<>();
	
	// create Todo
	public Entites createTodo(Entites entites) 
	{
		todo.add(entites);
		return entites;
				
	}
	
	//get all todo
	public List<Entites> getAllTodo() {
		
		return todo;
	}
	
	//get single todo
	public Entites getTodoById(Long id) {
	    return todo.stream()
	            .filter(t -> id.equals(t.getId()))
	            .findAny()
	            .get();
	}
	
	// update Todo
	public Entites updatedTodo(Long id, Entites e1) {
		List<Entites> updatede2=todo.stream().map(t -> {
			if(id.equals(t.getId())) {
				t.setName(e1.getName());
				return e1;
			}
			else {
				return e1;
			}
			
		}).collect(Collectors.toList());
		todo=updatede2;
		e1.setId(id);
		return e1;
		
		}

	// delete todo
	
	public void deleteTodo(Long id) {
		 Optional<Entites> optionalTodo = todo.stream()
		            .filter(t -> id.equals(t.getId()))
		            .findAny();
		 
		  if (optionalTodo.isPresent()) {
		        todo.remove(optionalTodo.get());
		    } else {
		        throw new RuntimeException("Todo with ID " + id + " not found");
		    }
	}
	

}
