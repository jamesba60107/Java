package com.study.ocp.day03;

public class StringEquals {
	
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s1)); // 忽略大小寫的比較
		}
}
