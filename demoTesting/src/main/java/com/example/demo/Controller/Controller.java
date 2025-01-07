package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Service;
import com.example.demo.entites.Entites;

@RestController
@RequestMapping("/api")
public class Controller
{
	
	@Autowired
	private Service service;
	Random random  = new  Random();
	// create Todo
	@PostMapping
	public Entites createTodo(@RequestBody Entites entites) {
		Long id=random.nextLong(9999999);
		entites.setId(id);
		service.createTodo(entites);
		return entites;
		
	}
	@GetMapping
	 public List<Entites> getAllTodo(){
		 return  service.getAllTodo();
	}
	// get single todo
	
    @GetMapping("/{id}")
    public ResponseEntity<?> getSingleTodo(@PathVariable Long id) {
       
            Entites todo = service.getTodoById(id);
            return ResponseEntity.ok(todo);
        
    }
	
    // update todo
    @PutMapping("/{id}")
    public ResponseEntity<Entites> updateTodo(@RequestBody Entites todo, @PathVariable Long id){
    	Entites e1=service.updatedTodo(id, todo);
    	return ResponseEntity.ok(e1);
    	    	
    }
    //delete todo
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        try {
            service.deleteTodo(id);
            return ResponseEntity.ok("Todo with ID " + id + " deleted successfully");
        } catch (RuntimeException ex) {
            return ResponseEntity.status(404).body(ex.getMessage());
        }
    }

}
