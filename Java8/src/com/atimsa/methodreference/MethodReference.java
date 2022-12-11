package com.atimsa.methodreference;

public class MethodReference {
	public void display() {
		for(int i=0;i<10;i++) {
			System.out.println("Child");
		}
	
	}
	
	public static void display1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child1");
		}
		
	} 
	
	MethodReference(){
		for(int i=0;i<10;i++) {
			System.out.println("Constructor");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non static Method Reference
		Runnable r=new MethodReference()::display;
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
		
		// static Method Reference
		Runnable r1=MethodReference::display1;
		Thread t1=new Thread(r1);
//		System.out.println();
//		System.out.println();
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main1");
		}
		
		//Constructor based reference
		Runnable r2=MethodReference::new;
		

		Thread t2=new Thread(r2);
//		System.out.println();
//		System.out.println();
		t2.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main1");
		}
		

	}

}
