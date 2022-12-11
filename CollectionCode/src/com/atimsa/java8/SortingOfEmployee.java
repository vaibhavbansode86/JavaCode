package com.atimsa.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOfEmployee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(1,"sgf"));
		l.add(new Employee(2,"asgf"));
		l.add(new Employee(2,"csgf"));
		l.add(new Employee(3,"wsgf"));
		l.add(new Employee(4,"bsgf"));
		l.add(new Employee(5,"sgf"));
		l.add(new Employee(6,"sbgf"));
		l.add(new Employee(7,"segf"));
		
		// Sorted by name
		Comparator<Employee> c=(e1,e2)->e1.name.compareTo(e2.name);
		List<Employee> list = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(list);
		
		// Sorted by id
		Comparator <Employee>c1=(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0;
		List<Employee> list1 = l.stream().sorted(c1).collect(Collectors.toList());
		System.out.println(list1);
		
		//Sorted by inner class
		Collections.sort(l, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}});
		System.out.println(l);
	}

}
