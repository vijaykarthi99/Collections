package org.Collections;

public class StringClass {
public static void main(String[] args) {
	String s="Java_is Easy";
	String s1="Java";
	String s2="JaVA";
	String s3="This is Java Program";
	String s4="";
	String s5="       This is Java Program";
	
	System.out.println(s.length());
	
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	
	System.out.println(s.indexOf('o'));
	System.out.println(s.indexOf('a'));
	System.out.println(s.lastIndexOf('a'));
	
	System.out.println(s.charAt(4));
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s.contains(s1));
	System.out.println(s2.contains("ava"));
	
	System.out.println(s.replace(" ", ":"));
	
	System.out.println(s3.startsWith("this"));
	System.out.println(s3.startsWith("This"));
	System.out.println(s3.endsWith("ram"));

	System.out.println(s4.isEmpty());
	
	System.out.println(s5.trim());
	
	System.out.println(s3.substring(1));
	
	String m= "Mani@gmail@com";
	
	
	String[] split = m.split("i@");
	for (String x : split) {
		System.out.println(x);
	}
	
	String a="";
	System.out.println(System.identityHashCode(a));
	String a1=" ";
	System.out.println(System.identityHashCode(a1));
	String a2=null;
	System.out.println(System.identityHashCode(a2));

	
}
	
}
