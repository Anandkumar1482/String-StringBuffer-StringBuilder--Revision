package com.string.constructors;

public class StringByteConstructor {
	public static void main(String[] args) {

		byte[] b = { 100, 101, 102, 103, 104 };
		String s = new String(b);
		System.out.println(s);
	}
}
