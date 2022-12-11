package com.atimsa.defaultmethod;

public interface DefaultInterface {
	default void m1() {
		System.out.println("DefaultInterface");
	}

}
