package com.usecases;
import java.util.Scanner;

import com.colors.Color;
public class Main {
	
	  
	public static void main(String[] args) {
		
		  
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      System.out.println("If you are Administrator then select 0 and if Faculty then select 1");
	       int ans=s.nextInt();
	      
	       
	       
	       if(ans==0) {
	    	   AdminQury admin=new AdminQury();
	    	   admin.login();
	    	   
	       }
	       else {
	    	   FacultyQury f=new FacultyQury();
	    	   f.print();
	       }
       
	}

}
