package com.atimsa.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareFilterAndAverageOfNumbers {

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
		
		List<Integer> result = l.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(result);
		l.stream().map(n->n*n).filter(n->n>100).mapToInt(n->n).average().getAsDouble();
	}

}
