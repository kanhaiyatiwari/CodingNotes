package com.masai;

public class Main {

	public static void main(String[] args) {
		A a=new A();
		//a.run();//just normal mathord coll
	//a.start();//thread coll
	
//		
//		for (int i=0;i<40;i++) {
//		System.out.println("inside Main mehod "+i);
//		}
//		a.start();
		
		
		At at= new At();
		Thread att=new Thread(at);
		att.setPriority(1);
		att.setName("virat");
		att.start();

		B b=new B();
		Thread bt =new Thread(b);
		bt.setPriority(10);
		bt.setName("Dhoni");
		bt.start();
	}
}
