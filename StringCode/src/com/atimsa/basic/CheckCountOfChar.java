package com.atimsa.basic;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class CheckCountOfChar {
	public static HashMap<String,Integer> checkChar(String s){
		HashMap<String, Integer> hp=new HashMap<String, Integer>();
		char []arr=s.toCharArray();
		int vCount=0;
		int aCount=0;
		int dCount=0;
		String []type= {"Vowels","Alphabets","Digit"};
		for(char c:arr) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
				vCount++;
			}
			else if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
				aCount++;
			}else if(c>='0' && c<='9'){
				dCount++;
			}

		}
		hp.put(type[0], vCount);
		hp.put(type[1], aCount);
		hp.put(type[2], dCount);
		
		return hp;
				
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String");
		String str=sc.next();
		HashMap<String, Integer> hp = checkChar(str);
		
		 Set<Entry<String,Integer>> entrySet = hp.entrySet();
		for(Entry e:entrySet) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
