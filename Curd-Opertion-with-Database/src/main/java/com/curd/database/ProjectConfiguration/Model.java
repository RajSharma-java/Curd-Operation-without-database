package com.curd.database.ProjectConfiguration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Model {
	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
		
	}
}
