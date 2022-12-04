package com.prac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.prac.buisnessbean.AssetBean;
import com.prac.buisnessbean.EmployeeBean;
import com.prac.entity.AssetEntity;
import com.prac.entity.EmployeeEntity;
import com.prac.utility.JPAUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		EntityManager entityManager = null;
		int employeeId = 0;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			AssetEntity assetEntity = new AssetEntity();
			assetEntity.setAssetName(assetBean.getAssetName());
			assetEntity.setAssetBrandName(assetBean.getAssetBrandName());
			assetEntity.setValidityYears(assetBean.getAssetValidityYear());
			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setEmployeeName(employeeBean.getEmployeeName());
			employeeEntity.setRole(employeeBean.getRole());
			employeeEntity.setSalary(employeeBean.getSalary());
			employeeEntity.setInsertTime(employeeBean.getInsertTime());
			employeeEntity.setAssetEntity(assetEntity);	
			entityManager.getTransaction().begin();
				// try to commit persistence of assetEntity and persist the employee entity
				entityManager.persist(assetEntity);
			  entityManager.persist(employeeEntity);
			entityManager.getTransaction().commit();
			employeeId = employeeEntity.getEmployeeId();
	
		} catch (Exception exception) {
			// uncomment the below stack trace to see the error
			//exception.printStackTrace();
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return employeeId;
	}
	
	
	
	
		
}
