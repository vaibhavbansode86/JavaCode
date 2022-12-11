package com.atimsa.basic;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MinimumMaximumPalindrome {

	public static void main(String[] args) {
		String name="vaibiav";
		TreeMap<Integer,String> t= new TreeMap<Integer,String>();
		for(int i=0;i<name.length()-1;i++) {
			for(int j=i+2;j<=name.length();j++) {
				StringBuilder sb=new StringBuilder(name.substring(i, j));
				String s=sb.toString();

				StringBuilder sb1=sb.reverse();
				String s1=sb1.toString();
				
				if(s.equals(s1)) {
					
					t.put(s.length(),s);
				}
			}
		}
		Set<Entry<Integer,String>> entrySet = t.entrySet();
		int count=1;
		int maxlen=t.size();
		for(Entry <Integer,String> entry:entrySet) {
			if(count==1) {
				System.out.println("minimum palindrom: "+entry.getValue());
			}else if(count==maxlen) {
				System.out.println("maximum palindrom: "+entry.getValue());
			}
			count++;
		}
	}

}
