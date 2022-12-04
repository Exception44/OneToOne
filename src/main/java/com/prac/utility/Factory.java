package com.prac.utility;

import com.prac.dao.EmployeeDAO;
import com.prac.dao.EmployeeDAOImpl;
import com.prac.service.EmployeeService;
import com.prac.service.EmployeeServiceImpl;

public class Factory {
	public static EmployeeDAO createEmployeeDAO() {
		return (EmployeeDAO) new EmployeeDAOImpl();
	}
	public static  EmployeeService createEmployeeService() {
		return (EmployeeService) new EmployeeServiceImpl();
	}

}
