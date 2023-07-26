package com.masai;

public class At implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=20;i++) { System.out.println(Thread.currentThread().getName()+" "
				+i);
		
		
		}
		
	}

}
