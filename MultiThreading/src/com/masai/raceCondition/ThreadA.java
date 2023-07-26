package com.masai.raceCondition;

public class ThreadA extends Thread{
Common c;
String  name;

	public ThreadA(Common c, String name) {
	super();
	this.c = c;
	this.name = name;
}

	@Override
	public void run() {
		c.func1(name);
	}
}
