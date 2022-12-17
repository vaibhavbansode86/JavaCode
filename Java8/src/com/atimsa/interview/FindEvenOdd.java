package com.atimsa.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FindEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		System.out.println("Even number");
		
		Consumer<Integer> c=n->System.out.print(" "+n);
		l.stream().filter(n->n%2==0).forEach(n->c.accept(n));
		
		System.out.println("\nOdd number");
		l.stream().filter(n->n%2!=0).forEach(System.out::println);
		
	
	}

}
