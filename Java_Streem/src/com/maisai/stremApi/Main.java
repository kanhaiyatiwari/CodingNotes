package com.maisai.stremApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.masai.functinalIntr.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("one1");
		al.add("one2");
		al.add("one3");
		Stream<String>st=al.stream();
		st.forEach((String i)->System.out.println(i));
		//st.forEach((String i)->System.out.println(i))since forEach a terminal mathord;
//	1:-	: print all the Student marks from the List of Student using stream

		ArrayList<Student> stu = new ArrayList<>();
		stu.add(new Student("kNHiy",1,"rah",100));
		stu.add(new Student("tam",2,"ka;",500));
		stu.add(new Student("Bheem",3,"neha",200));
		stu.add(new Student("saneh",5,"rah",300));
		stu.add(new Student("kNHiy",1,"rah",100));
		
//		using Collection.forEach;
		stu.forEach(i->System.out.println(i.getMarks()));
//		using stream api
//		Stream<Student> sst=stu.stream();
//	for each:-	sst.forEach(i->System.out.println(i));
		
//		filter this thake predicate and pre has test mathord;
		
		
//sst.filter(i->i.getMarks()>100).forEach(i->System.out.println(i));
	
//get anther list with filter
	
		
//		List<Student> anlist=stu.stream().filter(i->i.getMarks()>100).collect(Collectors.toList());
	
	}

}
