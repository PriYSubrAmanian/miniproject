package com.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.InventoryManagement;
import com.utility.HibernateUtility;

public class Create 
{
	public  void create()
	{
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
        
         
         InventoryManagement im = new InventoryManagement (1001,"Bike",50,85000);
         InventoryManagement im1 = new InventoryManagement(1002,"Car",50,185000);
         InventoryManagement im2 = new InventoryManagement(1003,"Cycle",50,15000);
         InventoryManagement im3 = new InventoryManagement(1004,"Scater",20,5000);
         
}
}
