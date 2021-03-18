package com.string.methods.string;

/*to perform content comparison where case is not important*/

/*Note :In general we can use equalsIgnoreCase() method to validate usernames where case is not
 * important .
 * where as we can equals() method to validate password where case is important.
 * */
public class MethodequalIgnoreCase {

	public static void main(String[] args) {
		String s = "durga";
		System.out.println(s.equals("Durga"));
		System.out.println(s.equalsIgnoreCase("DURGA"));
	}
}
