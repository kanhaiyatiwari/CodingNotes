package com.masai;

public class A  extends Thread{
	@Override
	public void run(){
	for(int i=40;i<100;i++){
	System.out.println("inside run mehod "+i);
	}
	System.out.println("end of run() method");

}
}
