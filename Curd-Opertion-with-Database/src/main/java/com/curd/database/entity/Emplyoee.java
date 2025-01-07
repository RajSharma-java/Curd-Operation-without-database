package com.curd.database.entity;

import java.sql.Date;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emplyoee {

	@Id
	private String emplyoee_id;
	
	private String first_name;
	
	
	private String second_name;
	
	private String sex;
	
	private String city;
	
	private double salary;
	
	private Long contact;
	
	private String Date_of_Joining;
	
	
	
	
	
	
	
}
