package com.atimsa.java8;

public class ThreadingByAnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++)
					System.out.println("Child Thread");
				
			}};
			
			Thread t= new Thread(r);
			t.start();
			for(int i=0;i<10;i++)
				System.out.println("Main Thread");
	}

}
