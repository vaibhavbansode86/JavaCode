package com.atimsa.Lambda;

public class demo {
	

	public static void main(String[] args) {
		printInterface pi=()->System.out.println("definition of interface method");
		pi.display();
		
		AdditionInterface ai=(a,b)->a+b;
		System.out.println(ai.add(44,22));
		
		SquareInterface si=n->n*n;
		System.out.println(si.sqr(5));
		
		SquareInterface si1= n->{return n*n;};
		int sqr=si1.sqr(5);
		System.out.println(sqr);
		
		Runnable r=()->{for(int i=0;i<10;i++) {
			System.out.println("Child thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0; i<10;i++) {
			System.out.println("Main Thread");
		}

	}


}
