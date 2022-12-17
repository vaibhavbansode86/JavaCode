package com.atimsa.interview;

import java.util.ArrayList;
import java.util.List;

public class PrintAverageOfAllNumbers {

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
		
		double avg = l.stream().mapToInt(n->n).average().getAsDouble();
		System.out.println(avg);
	}

}
