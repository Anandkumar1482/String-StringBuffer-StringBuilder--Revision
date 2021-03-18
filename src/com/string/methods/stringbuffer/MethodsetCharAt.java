package com.string.methods.stringbuffer;

/*to replace the character located at specified index */
public class MethodsetCharAt {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("tece ");
		sb.append("solutions");
		System.out.println(sb);
		sb.setCharAt(3, 'h');
		System.out.println(sb);
	}
}