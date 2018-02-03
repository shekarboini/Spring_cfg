package com.hexa.service;

import com.hexa.dao.EmployeeDAO;

public class EmpService {
	
	private EmployeeDAO empDao;
	
	
	
	public EmployeeDAO getEmpDao() {
		return empDao;
	}



	public void setEmpDao(EmployeeDAO empDao) {
		this.empDao = empDao;
	}



	public void empService() {
		System.out.println("EmpService: empService()");
		empDao.empDao();
	}

}
