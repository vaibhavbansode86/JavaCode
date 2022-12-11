package com.atimsa.predefinedfunctionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class PreDEfFunInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=n->n%2==0;
		System.out.println(p.test(5)); // false
		
		Predicate<Integer> p1=n->n>5;
		System.out.println(p.and (p1).test(5));// false
		System.out.println(p.and (p1).negate().test(5)); // true
		
		Function <Integer,Integer>f=n->n*n;
		System.out.println(f.apply(5)); // 25
		
		Function <Integer,Integer>f2=n->n+n;
		System.out.println(f.andThen(f2).apply(5)); // 50
		System.out.println(f.compose (f2).apply(5)); // 100
		
		
		Consumer<Integer> c=n->System.out.println(n);
		c.accept(5); // 5
		
		Supplier<Integer> s=()->{return 5;};
		System.out.println(s.get()); // 5

	}

}
