package com.usecases;
import java.util.*;

import com.colors.Color;
import com.exception.AdminException;
import com.exception.CourceplanException;
import com.masai.dao.*;


public class AdminQury {
	;
	public  void login() {
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+"pealse enter your username"+Color.ANSI_RESET);
		String username=s.next();
		System.out.println(Color.ANSI_YELLOW+"pealse enter your password"+Color.ANSI_RESET);
		String password=s.next();
		System.out.println(Color.ANSI_blue+"pealse please wait......"+Color.ANSI_RESET);
		AdministratorDao user= new  AdministratorDaoemply();
		
		try {
			String a=user.loginAdmin1(username, password);
			System.out.println(a);
			System.out.println();
			optins() ;
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public  void optins() {
		Scanner s=new Scanner(System.in);
		System.out.println("please select any one");
		System.out.println(Color.ANSI_YELLOW+"1:-course-related operations \r\n"
				+ "2:-batch-related operations \r\n"
				+ "3:-Faculty.-related operations \r\n"
				+ "4:-Allocate faculty to a batch  \r\n"
				+ "5:-Course plan--related operations \r\n"
				+ "6:-View the Day wise update of every batch. \r\n"
				+ "7:-Generate Reports for every batch.\r\n"
				+ "8:-not to choose any option.\r\n"
				+ ""+Color.ANSI_RESET);
		int option=s.nextInt();
		if(option==1) {
			CourseQury course=new CourseQury ();
			course.print();
		}
		if(option==2) {
			BatchQury batch=new BatchQury () ;
			batch.create();
		}
		
		if(option==3) {
			FacultyQury faculty=new FacultyQury();
			faculty.print();
		}
		
	}
	

}
