package com.string.methods.stringbuffer;

public class Methodinsert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefghihjklmnopq");
		sb.insert(1, false);
		sb.insert(0, "alphabets");
		System.out.println(sb);
	}
}
