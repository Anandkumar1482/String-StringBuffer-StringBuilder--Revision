package com.string.methods.stringbuffer;

public class Methodcapacity {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ak");
		sb.append("tech");
		sb.append("star");
		System.out.println(sb.capacity());
	}
}
