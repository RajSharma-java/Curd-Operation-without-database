package com.curd.database.dao;

import com.curd.database.entity.Raj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RajDao {
	
	private Long id;
	
	private String name;
	
	private String address;
	
}
