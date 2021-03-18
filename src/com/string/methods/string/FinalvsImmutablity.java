package com.string.methods.string;

public class FinalvsImmutablity {
	public static void main(String[] args) {
		final StringBuffer s = new StringBuffer();
		s.append("anand");
		System.out.println(s);
		s.append("kumar");
		System.out.println(s);
		// s=new StringBuffer("");//The final local variable s cannot be assigned.
	}
}
