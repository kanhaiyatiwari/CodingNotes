package com.masai;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pemutation {

	public static void main(String[] args) {
		solve("abac","");
		System.out.println(solve1("abac",""));
	}
	public static void solve(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		solve(str.substring(1),ans+ch);
		solve(str.substring(1),ans);
	}
	
	
	public static Set<String> solve1(String str,String ans) {
		Set<String>list=new HashSet<>();
		if(str.length()==0) {
			list.add(ans);
			return list;
		}
		char ch=str.charAt(0);
		Set<String>list1=solve1(str.substring(1),ans+ch);
		Set<String>list2=solve1(str.substring(1),ans);
		list1.addAll(list2);
		return list1;
	}
	
	
}
