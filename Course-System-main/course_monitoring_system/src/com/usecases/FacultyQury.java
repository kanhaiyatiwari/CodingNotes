package com.usecases;

import java.util.Scanner;

import com.colors.Color;
import com.exception.CourceplanException;
import com.exception.FacultyException;
import com.masai.dao.*;

public class FacultyQury {
	public static AdministratorDao faculty=new AdministratorDaoemply();
	public void create() {
		
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+" Please enter:-"+Color.ANSI_RESET+Color.ANSI_blue+ " "+"  unque id"+ Color.ANSI_RESET +
				Color.ANSI_PURPLE+" faculty-name"+Color.ANSI_RESET+" faculty-adress"+Color.ANSI_RESET+Color.ANSI_Red+"faculty-moblile"+Color.ANSI_RESET
				+Color.ANSI_PURPLE+" faculty-Email"+Color.ANSI_RESET+" faculty-username"+Color.ANSI_RESET+Color.ANSI_Red+" faculty-password"+Color.ANSI_RESET);
		
		int id=s.nextInt();
		String name=s.next();
		String address=s.next();
		String moblie=s.next();
		String email=s.next();
		String user=s.next();
		String password=s.next();
		try {
			String a=faculty.CreateFaculty(id, name, address, moblie, email, user, password);
			System.out.println(a);
		} catch (FacultyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println();
		}
	}

	public void updateFaculty() {
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+"Please enter:-" +
				Color.ANSI_PURPLE+"New value"+Color.ANSI_RESET+" faclty id"+Color.ANSI_RESET);
		
		String new_value=s.next();
		int id=s.nextInt();
		AdministratorDao update= new  AdministratorDaoemply();
		
			try {
				String a=update.UpdateFaculty(new_value, id);
				System.out.print(a);
			} catch (FacultyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.print(e.getMessage());
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
	public  void print() {
Scanner s=new Scanner(System.in);
		
		System.out.println("please select any one");
		System.out.println(Color.ANSI_YELLOW+"1:-Create Faculty \r\n"
				+ "2:-Update faculty \r\n"
				+ "3:-View Facuty\r\n"
				+ "4:-exit from this page \r\n"
				+ "5:-go back"
				+ ""+Color.ANSI_RESET);
		int op2=s.nextInt();
		if(op2==1) {
			create();
			print();
		}
		if(op2==2) {
			updateFaculty();
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
		if(op2==4) {
			Main m=new Main();
			m.main(null);
			return;
		}
	}
}
