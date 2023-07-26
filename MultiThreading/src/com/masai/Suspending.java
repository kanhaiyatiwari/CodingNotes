package com.masai;

public class Suspending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		At at= new At();
		Thread att=new Thread(at);
		
		att.setName("virat");
		att.start();

		B b=new B();
		Thread bt =new Thread(b);
		
		bt.setName("Dhoni");
		bt.start();

	}

}
