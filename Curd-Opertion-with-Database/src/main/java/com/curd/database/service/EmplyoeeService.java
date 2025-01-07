package com.curd.database.service;

import com.curd.database.dao.EmplyoeeDao;

public interface EmplyoeeService {
	
	// createDao 
	EmplyoeeDao create(EmplyoeeDao dao);
	
	//updateDao
	EmplyoeeDao update(EmplyoeeDao dao, String id);
	
	//getAll 
	
	EmplyoeeDao getAllEmplyoee();
	
	//getSingle 
	EmplyoeeDao getEmplyoeeById(String id);
	
	//delete id
	void delete(String id);
	
	
	

}
