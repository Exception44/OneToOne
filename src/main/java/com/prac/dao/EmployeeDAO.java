package com.prac.dao;

import com.prac.buisnessbean.AssetBean;
import com.prac.buisnessbean.EmployeeBean;

public interface EmployeeDAO {
	
	 public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception;
	
}
