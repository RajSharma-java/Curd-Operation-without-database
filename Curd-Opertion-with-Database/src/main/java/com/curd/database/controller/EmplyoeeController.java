package com.curd.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.database.dao.EmplyoeeDao;
import com.curd.database.service.EmplyoeeService;

@RestController
@RequestMapping("/emplyoee")
public class EmplyoeeController {
	@Autowired
	private EmplyoeeService service;
	
	
	@PostMapping
	public ResponseEntity<EmplyoeeDao>  create(@RequestBody EmplyoeeDao dao) {
		EmplyoeeDao e1= service.create(dao);
		return new ResponseEntity<>(e1, HttpStatus.CREATED);
		
	}

}
