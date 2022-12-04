package com.prac.ui;

import java.util.Date;

import com.prac.buisnessbean.AssetBean;
import com.prac.buisnessbean.EmployeeBean;
import com.prac.service.EmployeeService;
import com.prac.utility.Factory;
import com.prac.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			insertAssetWithEmployee();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void insertAssetWithEmployee() {
		int employeeId = 0;
		try {
			EmployeeService service = Factory.createEmployeeService();
			EmployeeBean employee = new EmployeeBean();
			employee.setEmployeeName("Sam");
			employee.setInsertTime(new Date());
			employee.setRole("Sr.Developer");
			employee.setSalary(150000.00);

			AssetBean asset = new AssetBean();
			asset.setAssetName("Laptop");
			asset.setAssetBrandName("hp");
			asset.setAssetValidityYear(5);

			employeeId = service.insertAssetWithEmployee(employee, asset);
			System.out.println("Employee inserted successfully!!" + employeeId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
