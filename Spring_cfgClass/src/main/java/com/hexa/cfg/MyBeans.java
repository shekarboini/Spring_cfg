package com.hexa.cfg;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexa.dao.EmployeeDAO;
import com.hexa.service.EmpService;

@Configuration
public class MyBeans {
	
	@Bean(name="EmpService", autowire=Autowire.BY_TYPE)
	public EmpService empService() {
		return new EmpService();
	}
	
	@Bean(name="EmployeeDAO", autowire=Autowire.BY_TYPE)
	public EmployeeDAO empDao() {
		return new EmployeeDAO();
	}
	
	
}
