package com;

import java.util.List;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		List<Integer> a = null;
			
			String any = "\\w+\\(\\w+\\)\\d*\\[\\w+\\]";

		String test1 = "Java(TM)2016[javaee]";
		String test2 ="I love java";
		String test3 = "pkrishnaa@gmail.com";
		String test4 = "331.221.2345";
		
		String email = "\\w+\\@?\\w+\\.(com|net)";
		String phone = "\\d{3}[.-]?\\d{3}[.,]?\\d{4}";
		String phone2 = "\\d{3}\\.\\d{3}\\.\\d{4}";
		
		System.out.println(test1.matches(any));
		System.out.println("email test ="+test3.matches(email));
		System.out.println("phone test ="+test4.matches(phone));
		System.out.println("phone test2 ="+test4.matches(phone2));
		
		
		Pattern p = Pattern.compile("\\s");
		String[]  ss = p.split(test2);
		for (int i=ss.length-1;i>=0;i--) {
			System.out.println(ss[i]);
		}

	}

}
