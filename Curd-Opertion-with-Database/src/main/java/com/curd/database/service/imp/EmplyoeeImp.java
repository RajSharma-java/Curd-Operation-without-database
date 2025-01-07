package com.curd.database.service.imp;

import java.util.Random;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.database.dao.EmplyoeeDao;
import com.curd.database.entity.Emplyoee;
import com.curd.database.repository.EmplyoeeRepo;
import com.curd.database.service.EmplyoeeService;

@Service
public class EmplyoeeImp implements EmplyoeeService{
	
	@Autowired
	private EmplyoeeRepo repo;
	@Autowired
	private ModelMapper mapper;
	
	

	@Override
	public EmplyoeeDao create(EmplyoeeDao dao) {
		// Generate autoid
		String idd=UUID.randomUUID().toString();
		dao.setEmplyoee_id(idd);
		// dao convert into the entity
		Emplyoee emplyoee= mapper.map(dao, Emplyoee.class);
		
		Emplyoee saved= repo.save(emplyoee);
		
		// entity convert to dao
		return mapper.map(saved,EmplyoeeDao.class);
	}

	@Override
	public EmplyoeeDao update(EmplyoeeDao dao, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmplyoeeDao getAllEmplyoee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmplyoeeDao getEmplyoeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
