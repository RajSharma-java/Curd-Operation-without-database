package com.curd.database.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmplyoeeDao {
	
private String emplyoee_id;
	
	private String first_name;
	
	private String second_name;
	
	private String sex;
	
	private String city;
	
	private double salary;
	
	private Long contact;
	
	private String Date_of_Joining;
	
}
