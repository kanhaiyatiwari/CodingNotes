package com.masai;

public class B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=21;i<60;i++)System.out.println(Thread.currentThread().getName()+" "
				+i);
	}

}
