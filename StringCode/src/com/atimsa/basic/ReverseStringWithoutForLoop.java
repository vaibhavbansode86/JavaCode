package com.atimsa.basic;

import java.util.stream.Stream;

public class ReverseStringWithoutForLoop {
	public static  void reverse(String s) {
		if(s.equals(null)|| s.length()<=1) {
			System.out.println(s);
		}else {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
	}
	public static void main(String[] args) {
		String s="Ashrita";
		reverse(s);
		String []s1=s.split("");
	}

}
