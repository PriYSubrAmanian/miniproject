package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.entity.InventoryManagement;
import com.utility.HibernateUtility;

public class Update
{
	public void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Product number");
		int Product_no=sc.nextInt();
		
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  InventoryManagement im = (InventoryManagement)session.get(InventoryManagement.class,Product_no);
		 // im.setProduct_name("bikes");
		  //im.setNoofproducts(50);
		  //im.setCostperproduct(50000);
		 
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}





}
