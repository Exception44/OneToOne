package com.prac.service;

import com.prac.buisnessbean.AssetBean;
import com.prac.buisnessbean.EmployeeBean;

public interface EmployeeService {
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception;

}
