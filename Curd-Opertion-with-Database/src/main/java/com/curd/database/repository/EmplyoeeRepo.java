package com.curd.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.database.entity.Emplyoee;

public interface EmplyoeeRepo extends JpaRepository<Emplyoee, String> {

}
