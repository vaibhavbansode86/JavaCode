package com.atimsa.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		//1) Java Program to count the total number of characters in a string
		String s="Pranav!!!!";
		System.out.println(s.length());
		int count=0;
		//3) Java Program to count the total number of punctuation characters exists in a String
	   
	    String c[]=s.split("");
	    for(int i=0;i<c.length;i++) {
	    	 Pattern pattern = Pattern.compile(c[i], Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
		   
		if(matcher.find())
			   count++;
	    }

		System.out.println(count);

		
		//4) Java Program to count the total number of vowels and consonants in a string
		String c1[]=s.split("");
		String v="[aeiou]";
		String cons="[a-z]";
		int cv=0;
		int cc=0;
		for(int i=0;i<c1.length;i++) {
			Pattern pattern=Pattern.compile(c1[i],Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(v);
			Matcher matcher2 = pattern.matcher(cons);
			if(matcher.find()) {
				cv++;
			}else if(matcher2.find()) {
				cc++;
			}
		}
		System.out.println("Number of vowels : "+cv);
		System.out.println("Number of consonant : "+cc);
	}
	
	


}
