package com.curd.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.database.dao.RajDao;
import com.curd.database.service.RajService;

@RestController
@RequestMapping("/raj")
public class RrajController 
{
	@Autowired
	private RajService service;
	
	@PostMapping
	public ResponseEntity<RajDao> create(@RequestBody RajDao dao) {
		 
		RajDao d1=service.create(dao);
		
		return new ResponseEntity<>(d1, HttpStatus.CREATED);
		
	}

}
