package com.atimsa.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aba";
		int flag=0;
		for(int i=0,j=s.length()-1;i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
