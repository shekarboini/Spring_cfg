package com.hexa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.service.EmpService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.hexa.cfg.MyBeans.class);
		
		EmpService service = context.getBean("EmpService",EmpService.class);
		
		service.empService();
	}

}
