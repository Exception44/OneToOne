package com.prac.service;

import com.prac.buisnessbean.AssetBean;
import com.prac.buisnessbean.EmployeeBean;
import com.prac.dao.EmployeeDAO;
import com.prac.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		int employeeId = 0;
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeId = employeeDAO.insertAssetWithEmployee(employeeBean, assetBean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employeeId;
	}
}

