package com.masai.functinalIntr;

public class Student {
private String name;
private int roll;
private String School;
private int marks;
public Student(String name, int roll, String school, int marks) {
	super();
	this.name = name;
	this.roll = roll;
	School = school;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getSchool() {
	return School;
}
public void setSchool(String school) {
	School = school;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", School=" + School + ", marks=" + marks + "]";
}

public Student(){
	
}
}
