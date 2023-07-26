package com.masai.aski;

public class asci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String as="1    ~!@#$%^&*";
		for(int i=0;i<as.length();i++) {
			char c=as.charAt(i);
			if(!Character.isDigit(c)&&!Character.isLetter(c)&&
					!Character.isWhitespace(c))System.out.println("yes ->  "+c);
			else	System.out.println("no");
			
		}

	}

}
