package com.masai.functinalIntr;

import java.util.function.Consumer;

public class CunsumerImpl implements  Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		for(int i=0;i<t.length();i++) {
			System.out.println(t.charAt(i));
		}
	}

}
