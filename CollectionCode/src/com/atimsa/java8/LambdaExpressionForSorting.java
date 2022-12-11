package com.atimsa.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionForSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>Arr=new ArrayList<Integer>();
		Arr.add(10);
		Arr.add(20);
		Arr.add(30);
		Arr.add(40);
		Arr.add(20);
		Arr.add(30);
		Arr.add(10);
		Arr.add(60);
		
		//Sorted in Ascending order
		Comparator<Integer> c=(a,b)->a.compareTo(b);
		List<Integer> collect = Arr.stream().sorted(c).collect(Collectors.toList());
		System.out.println(collect); //[10, 10, 20, 20, 30, 30, 40, 60]

		
		//Sorted in descending order
		Comparator<Integer> c1=(a,b)->-a.compareTo(b);
		List<Integer> collect1 = Arr.stream().sorted(c1).collect(Collectors.toList());
		System.out.println(collect1); //[60, 40, 30, 30, 20, 20, 10, 10]
		

	}

}
