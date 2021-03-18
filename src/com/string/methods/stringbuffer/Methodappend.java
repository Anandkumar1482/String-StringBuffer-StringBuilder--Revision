package com.string.methods.stringbuffer;

public class Methodappend {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		char[] ch = { 'a', 'b', 'c', 'd' };
		sb.append(ch);
		System.out.println(sb);
		System.out.println();
		sb.append(" pi value is ; ");
		sb.append(3.14 + " ");
		sb.append("exatly same as ");
		sb.append("true");
		System.out.println(sb);
	}
}
