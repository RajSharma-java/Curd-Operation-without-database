package com.curd.database.service.imp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.database.dao.RajDao;
import com.curd.database.entity.Raj;
import com.curd.database.repository.RajRepo;
import com.curd.database.service.RajService;

@Service
public class RajServiceImp implements RajService{
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private RajRepo repo;

	@Override
	public RajDao create(RajDao dao) {
		// convert dto into entity
		Raj r1 =mapper.map(dao, Raj.class);
		Raj saved = repo.save(r1);
		RajDao d1=mapper.map(saved, RajDao.class);
			return d1 ;
	}
	
	

}
