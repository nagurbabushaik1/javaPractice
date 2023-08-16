package com.stringsPractice;

import java.util.Arrays;

public class practice1 {

	public static void main(String[] args) {

	String s1 = " nagur babu ";
	
	String s2 =" NAGUR BABU ";
	
	System.out.println(s1.startsWith("na"));
	
	System.out.println(s1.endsWith("p"));
	
	System.out.println(s1.contains("agu"));
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s1.equals(s2));
	
	System.out.println(s2.length());
	
	System.out.println(s2.trim().length());
	
	System.out.println(s1.toUpperCase().trim());
	
	System.out.println(s2.toLowerCase().trim());
	
	System.out.println(s1.toCharArray());
	
	System.out.println(s1.indexOf("a"));
	
	System.out.println(s1.lastIndexOf("a"));
	
	System.out.println(s1.substring(3));
	
	System.out.println(s1.substring(2,6));
	
	System.out.println(Arrays.toString(s1.split(" ")));
	
	System.out.println(s1.charAt(5));
	
	System.out.println(s1.replace("a", "b"));
	
	String s4 = "123";
	
	System.out.println(Integer.valueOf(s4));
	
	int i = 54121;
	
	System.out.println(String.valueOf(i));
	
	String s5 = "";
	
	String s6 = "  ";
	
	String s7;
	
	System.out.println(s5.isBlank());
	System.out.println(s6.isBlank());
	
	System.out.println(s5.isEmpty());
	System.out.println(s6.isEmpty());


	
	
	
	
	
	



	}

}
