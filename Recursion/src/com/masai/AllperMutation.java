package com.masai;

public class AllperMutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="abc";
for(int i=0;i<a.length()+1;i++) {
//	System.out.println("left->  "+a.substring(0, i));
//	System.out.println("right-> "+a.substring(i,a.length()));
//	System.out.println();
	String l=a.substring(0, i);
	
	String r=a.substring(i,a.length());
	String b=l+'d'+r;
	System.out.println("->  "+b);
}

	}

}
