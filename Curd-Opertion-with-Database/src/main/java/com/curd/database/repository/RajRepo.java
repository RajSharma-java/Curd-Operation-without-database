package com.curd.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curd.database.dao.RajDao;
import com.curd.database.entity.Raj;

public interface RajRepo extends JpaRepository<Raj, Long>
{

	

}
