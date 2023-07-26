package com.masai.functinalIntr;

import java.util.function.Predicate;

public class PredicateImpl  implements Predicate<String>{


	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.equals("kanhaiya");
	}

}
