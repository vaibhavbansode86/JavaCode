package com.atimsa.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
	public static void main(String []args) {
		String s="Hellojjjj";
		int count=0;
		char c[]=s.toCharArray();
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					
				}

			}
			if(!al.contains(c[i])&&count>=1) {
				al.add(c[i]);
			}
			count=0;
		}
		System.out.println(al.toString());
		
	}


}
