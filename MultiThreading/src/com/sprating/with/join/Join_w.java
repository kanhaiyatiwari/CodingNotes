package com.sprating.with.join;

public class Join_w {
public static void main(String[] args) throws InterruptedException  {
	CalculagteSum csum=new CalculagteSum();
	Thread t=new Thread(csum);
	
	t.start();
	t.join();
	System.out.println(csum.sum);
	for(int i=50;i<70;i++) {
		System.out.println(i);
	}
}
}
