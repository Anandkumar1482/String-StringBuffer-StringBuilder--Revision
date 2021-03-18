package com.string.methods.string;

/*
 * Note: the overloaded operator (+) and += operators also meant for
 * Concatenation purpose only.
 */
public class Methodconcat {
	public static void main(String[] args) {
		String s = "durga";
		// s = s.concat("software");
		// s = s + "software";
		s += "software";
		System.out.println(s);
	}
}
