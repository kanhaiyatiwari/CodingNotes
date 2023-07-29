package com.usecases;

import java.util.Scanner;

import com.colors.Color;
import com.exception.CourceplanException;
import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoemply;

public class CourseQury {
	public void createCourse() {
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+"Please enter  :-"+Color.ANSI_RESET+Color.ANSI_blue+ " "+" unque id"+ Color.ANSI_RESET +
				Color.ANSI_PURPLE+"  course-name"+Color.ANSI_RESET+" fees"+Color.ANSI_RESET+Color.ANSI_Red+" Description"+Color.ANSI_RESET);
		int id=s.nextInt();
		String name=s.next();
		int fee=s.nextInt();
		String desc=s.next();
		AdministratorDao Create= new  AdministratorDaoemply();
		try {
			String a=Create.CreateCourse(id, name, fee, desc);
			System.out.println(a);
		} catch (CourceplanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public void updateCourse() {
		Scanner s=new Scanner(System.in);
		System.out.println(Color.ANSI_YELLOW+"Please enter:-" +
				Color.ANSI_PURPLE+"New name"+Color.ANSI_RESET+" id of course"+Color.ANSI_RESET);
		
		String new_value=s.next();
		int id=s.nextInt();
		AdministratorDao update= new  AdministratorDaoemply();
		try {
			String a=update.UpdateCourse( new_value, id);
			System.out.println(a);
		} catch (CourceplanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
	public void view() {
		Scanner S=new Scanner(System.in);
		System.out.println("please select id");
		int id=S.nextInt();
		AdministratorDao view= new  AdministratorDaoemply();
		try {
			String a=view.ViewCourse(id);
			System.out.println(a);
		} catch (CourceplanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
	public void print() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("please select any one");
		System.out.println(Color.ANSI_YELLOW+"1:-Create Course \r\n"
				+ "2:-Update Course \r\n"
				+ "3:-View Course\r\n"
				+ "4:-exit from this page \r\n"
				+ "5:-go back"
				+ ""+Color.ANSI_RESET);
		int op2=s.nextInt();
		if(op2==4) {
			Main m=new Main();
			m.main(null);
			return;
		}
		if(op2==5) {
			Main.main(null);
			return;
		}
		if(op2==1) {
			createCourse();
		print();
		}
		 if(op2==2)
			{
			updateCourse(); print();
			}
		 if(op2==3) {
			view();
			System.out.println("yes");
			print();
		}
		
	}

}
