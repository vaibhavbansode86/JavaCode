package com.atimsa.basic;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a: "+a+" b:"+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a: "+a+" b:"+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a: "+a+" b:"+b);
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a: "+a+" b:"+b);
		
		b=a+b-(a=b);
		System.out.println("a: "+a+" b:"+b);

	}

}
