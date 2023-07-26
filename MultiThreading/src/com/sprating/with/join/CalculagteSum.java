package com.sprating.with.join;

public class CalculagteSum  implements Runnable{
int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			sum+=i;
		}
	}

}
