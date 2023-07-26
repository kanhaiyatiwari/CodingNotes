package com.masai.functinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1By using class Implementation4
		
		Inter in=new InterImpl();
		in.sayHello("kanhaiya");
		
//		by using Annomouse class
//		for this we dont need to crreate a clsss we can symply withe
//		the here itself;
//				
		Inter in1=new InterImpl() {
			@Override
			public void sayHello(String name) {
				System.out.println("hello ->  "+name );
			}
		};
		in1.sayHello("bhanu");
		
//using lambda expration
		Inter in2=( String name)->{
			System.out.println("hello ji "+"\n"+name);
		};
		in2.sayHello("kalu");

	}

}
