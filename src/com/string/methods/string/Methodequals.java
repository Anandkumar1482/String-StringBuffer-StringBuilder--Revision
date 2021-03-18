package com.string.methods.string;

/*to perform content comparison where case is important
this is overriding version of Object class equals() method
where as we can equals() method to validate password where case is important.*/

public class Methodequals {
	public static void main(String[] args) {
		String s1 = "anand";
		String s2 = "anand";
		System.out.println(s1.equals(s2));
	}
}
