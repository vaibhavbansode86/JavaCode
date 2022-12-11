package com.atimsa.basic;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s="Calculate";
		char c[]=s.toLowerCase().toCharArray();
		Set<Character>sChar=new LinkedHashSet<Character>();
		for(char c1:c) {
			sChar.add(c1);
			
		}
		
		for(char c2:sChar) {
			int count=0;
			for(char c1:c) {
				if(c1==c2)
					count++;
				
				
			}
			
			if(count==1) {
				System.out.println(c2);
				break;
			}
		}
	}

}
