package com.masai.Mathord_refrance;

import com.masai.functinal.Inter;

public class Main {
	Main(){
		
	}
	Main(String name){
		System.out.println("Method reference using Constructor");
		}

	public static void sayHello(String name) {
		System.out.println("hello ->"+name);
	}
	public  void f2(String name) {
		System.out.println("hello  f2 ->"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inter it=Main::sayHello;
//for astatic mathorsd
it.sayHello("kanhaiya");
//non  static

Inter it1=new Main()::f2;
it1.sayHello("bhanu");


//using cunstroruct
Inter it3= Main::new;
it3.sayHello("kanhaiya");
	}

}
