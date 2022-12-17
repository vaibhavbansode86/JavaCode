package com.atimsa.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
		

	}

}
