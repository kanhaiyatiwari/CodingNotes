package com.masai.raceCondition;

public class Common {
public void func1(String name) {
	System.out.print("Welcom ");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("name:- "+name);
}
}
