package com.atimsa.basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ShowDublicatesCharFromString {

	public static void main(String[] args) {
		String s="Helloooojjj";
		String []c=s.split("");
		Set<String> s1=new LinkedHashSet<String>();
		for(String s2:c) {
			s1.add(s2);
		}
		int count=0;
		for(String s3:s1) {
			for(int i=0;i<c.length;i++) {
				if(s3.equals(c[i]))
					count++;
			}
			if(count>1) {
				System.out.println(s3);
				
			}
			count=0;
		}
	}

}
