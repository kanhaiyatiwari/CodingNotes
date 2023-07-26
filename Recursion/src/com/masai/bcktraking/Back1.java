package com.masai.bcktraking;

public class Back1 {
public static void main(String[] args) {
	
	int[][]arr=new int[3][3];
	System.out.println(func(0,0,arr,0));
}
public static int func(int r,int c,int [][]arr,int count) {
if(r==arr.length-1&&c==arr[0].length-1) {
	count++;
	return count;
}

if(r==arr.length-1&&c!=arr[0].length-1) {
	int right1=func(r,c+1,arr,count);
	return right1;
}
if(r!=arr.length-1&&c==arr[0].length-1) {
	int down1 =func(r+1,c,arr,count);
	return down1;
}
int down =func(r+1,c,arr,count);
int right=func(r,c+1,arr,count);
int dio=func(r+1,c+1,arr,count);
return down+right+dio;

	
}
}
