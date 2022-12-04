package com.prac.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManagerFactory buildEntityManagerFactory() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
			return entityManagerFactory;
			
		}
		catch(Throwable ex){
			System.out.println("Initialization of EntityManagerFactory failed." + ex);
			throw new RuntimeException(ex);
		}
	}
    public static EntityManagerFactory getEntityManagerFactory() {
    	if(entityManagerFactory == null) {
    		entityManagerFactory = buildEntityManagerFactory();
    	}
    	return entityManagerFactory;
    }
    public static void  closeEntityManagerFactory() {
    	if(entityManagerFactory != null && entityManagerFactory.isOpen()==true ) entityManagerFactory.close();
    }
}
