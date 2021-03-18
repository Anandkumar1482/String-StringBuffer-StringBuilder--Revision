package com.string.constructors;

public class StringConstructor1 {
	public static void main(String[] args) {
		String s1 = new String("Durga");
		s1.concat("software");
		String s2 = s1.concat("solutions");
		s1 = s1.concat("soft");
		System.out.println(s1 + " durgasoft");
		System.out.println(s2 + " durgasolutions");
	}
}
