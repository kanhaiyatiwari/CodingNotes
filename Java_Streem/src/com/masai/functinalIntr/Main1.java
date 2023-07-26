package com.masai.functinalIntr;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> sp=new PredicateImpl();
		System.out.println(sp.test("kanhaiya"));
//		using lambda
		Predicate<String> sc=(s1)->s1.equals("kanhaiya");
	System.out.println(	sc.test("kanhaiya"));
		
	
	Consumer<String> ct=new CunsumerImpl();
	ct.accept("kanhaiya");
	
//	using lambda
	Consumer<Student> cl=(t1)-> System.out.println(t1
			.getName()+" "+t1.getMarks());
	cl.accept(new Student("kalu",12,"yggh",34));
	
	
//suplire exmaple
	Supplier<String> st=()->"kanhaiya tiwari chodhiri charan sing";
System.out.println(	st.get());
//function
Function<String, String[]>ts= i-> i.split(" ");
System.out.println(Arrays.toString(ts.apply("in function inter "
		+ "face we can mange orgument and return type coordingly")));
		
	}

}
