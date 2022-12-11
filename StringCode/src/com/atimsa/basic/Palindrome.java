package com.atimsa.basic;

public class Palindrome {

	public static void main(String[] args) {
		String name1="Abcba";
		String name=name1.toLowerCase();
		int flag =0;
		for(int i=0,j=name.length()-1;i<=j;i++,j--) {
			if(name.charAt(i)!=name.charAt(j)) {
				System.out.println("String is not Palindrome");
				flag=1;
				break;
			}
			
		}
		if(flag==0){
			System.out.println("String is Palindrome");
		}
	}

}
