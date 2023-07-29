package com.usecases;

import java.util.Scanner;

import com.colors.Color;
import com.exception.BatchException;
import com.exception.FacultyException;
import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoemply;

public class BatchQury {
	public static AdministratorDao batch=new AdministratorDaoemply();
	public void create()  {
		
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+"Please enter:-"+Color.ANSI_RESET+Color.ANSI_blue+ " "+"unque id"+ Color.ANSI_RESET +
				Color.ANSI_PURPLE+"Course-id"+Color.ANSI_RESET+"Student -number "+Color.ANSI_RESET+Color.ANSI_Red+"start-date"+Color.ANSI_RESET
				+Color.ANSI_PURPLE+"duration");
		int id =s.nextInt();
		int cid=s.nextInt();
		int N_s=s.nextInt();	
		String date=s.next();
		String duration=s.next();
		try {
			String a=batch.CreateBatch(id, cid, N_s, date, duration);
			System.out.println(a);
		} catch (BatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
		

	public void updateBatch() throws FacultyException {
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+"Please enter:-" +
				Color.ANSI_PURPLE+"New value"+Color.ANSI_RESET+" faclty id"+Color.ANSI_RESET);
		
		int new_value=s.nextInt();
		int id=s.nextInt();
		AdministratorDao update= new  AdministratorDaoemply();
		
			try {
				String a=update.UpdateBatch(new_value, id);
				System.out.println(a);
			} catch (BatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}	
	
	public void view() {
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_blue+"plese enter id"+Color.ANSI_RESET);
		int id=s.nextInt();
		AdministratorDao view= new  AdministratorDaoemply();
		try {
			view.ViewFaculty(id);
		} catch (FacultyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public void print() {
Scanner s=new Scanner(System.in);
		
		System.out.println("please select any one");
		System.out.println(Color.ANSI_YELLOW+"1:-Create batch \r\n"
				+ "2:-Update batch \r\n"
				+ "3:-View batch\r\n"
				+ "4:-exit from this page \r\n"
				+ "5:-go back"
				+ ""+Color.ANSI_RESET);
		int op2=s.nextInt();
		if(op2==1) {
			create();
			print();
		}
		if(op2==2) {
			//updateFaculty();
			print();
			
		}
		if(op2==3) {
			view();
			print();
		}
		if(op2==5) {
			AdminQury ad=new AdminQury();
			ad.optins();
		}
	}
}
