package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


import com.entity.InventoryManagement;
import com.utility.HibernateUtility;

public class View 
{
	public void view()
	{
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<InventoryManagement> query1=session.createQuery("from InventoryManagement");
	         
	        List<InventoryManagement> result=query1.list();
	         
	         
	       for(InventoryManagement im:result)
	      {
	       
	    	  System.out.println( im.getProduct_name());
	 		  System.out.println(im.getNoofproducts());
	 		  System.out.println(im.getCostperproduct());
	 		 
	         }

		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	}





}
