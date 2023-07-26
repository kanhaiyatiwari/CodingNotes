package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ans("abccda","",0));
	}
//	by passing arrgument
	public static String ans(String str,String ou,int i) {
		if(i==str.length())return ou;
		if(str.charAt(i)=='a') {
			return ans(str,ou,i+1);
		}
		ou+=str.charAt(i);
		return ans(str,ou,i+1);
	}

}
