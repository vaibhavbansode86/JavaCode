package com.atimsa.basic;

import java.util.HashSet;
import java.util.Set;

public class StringOccurance {

	public static void main(String[] args) {
		String s="welcome Sakshi to velocity and velocity welcome to Sakshi jaiswal";
		String s1[]=s.split(" ");
		Set <String>s2=new HashSet<String>();
		for(String i:s1) {
			s2.add(i);
		}
//		for(String j:s2) {
//			int count=0;
//			for(int k=0;k<s1.length;k++) {
//				if(j.equals(s1[k]))
//					count++;
//			}
//			if(count>1)
//				System.out.println(j+" : "+count);
//		}
		
		for(String j:s2) {
			int count=0;
			for(int k=0;k<s1.length;k++) {
				if(j.equals(s1[k]))
					count++;
			}
			if(count==1)
				System.out.print(j+" ");
		}

	}

}
