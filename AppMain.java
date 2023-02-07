package com.main;

import java.util.Scanner;

import com.dao.Create;
import com.dao.Delete;
import com.dao.Update;
import com.dao.View;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inventory Management");
		System.out.println("\n 1.Create and Insert");
		System.out.println("\n 2.Delete");
		System.out.println("\n 3.Update");
		System.out.println("\n 4.Select");
		System.out.println("enter the choice");
		
		int choice =sc.nextInt();
		
			switch(choice)
			{
				case 1:
					new Create().create();
					break;
				case 2:
					new Delete().delete();
					break;
				case 3:
					new Update().update();
					break;
				case 4:
					
					new View().view();
					break;
			}
			System.out.println("do u want to continue");
			s=sc.next();
		}
		while(s.equals("yes"));

	}
	}


