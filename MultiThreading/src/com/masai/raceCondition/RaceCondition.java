package com.masai.raceCondition;

public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Common c=new Common();
ThreadA ta=new ThreadA(c,"ram");
ThreadB tb=new ThreadB(c,"sam");
ta.start();
tb.start();
	}

}
