package com.atimsa.basic;


import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String str = "responsibility";
		String []c=str.split("");
		int count=0;
		Set <String> set1=new LinkedHashSet<String>();
		for(String s1:c) {
			set1.add(s1);
		}
		for(String s:set1) {
			for(int i=0;i<c.length;i++) {
				//System.out.println(s);
				if(s.equals(c[i])) {
					//System.out.println(s);
					count++;
				}
			}
			if(count>1) {
				System.out.println(s);
			}
			count=0;
		}

	}

}
