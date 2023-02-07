package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.entity.InventoryManagement;
import com.utility.HibernateUtility;

public class Delete 
{
	public void delete() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the product number");
	int Product_no=sc.nextInt();
	SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	
InventoryManagement im = (InventoryManagement)session.load(InventoryManagement.class, Product_no);
	session.delete(im);
	
	  System.out.println("Deleted Successfully");
	  session.getTransaction().commit();
	     sessionFactory.close();

	}




}
