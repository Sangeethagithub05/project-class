package org.acc;

public class Employee {
	public static void main(String[] args) {
		String s="Greens";
		int length = s.length();
		System.out.println(length);
		char c = s.charAt(3);
		System.out.println(c);
		String u = s.toUpperCase();
		System.out.println(u);
		String r=s.replace('e', 'i');
		System.out.println(r);
		boolean empty = s.isEmpty();
		System.out.println(empty);
	}
	

}
