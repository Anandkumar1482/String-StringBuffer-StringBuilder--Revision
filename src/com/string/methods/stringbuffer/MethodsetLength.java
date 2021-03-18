package com.string.methods.stringbuffer;

public class MethodsetLength {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("anandana");
		sb.setLength(8);
		// sb.append("anandana");
		System.out.println(sb.length());
		System.out.println(sb);
		sb.append(1);
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
