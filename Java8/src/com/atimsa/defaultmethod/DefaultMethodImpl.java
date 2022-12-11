package com.atimsa.defaultmethod;

public class DefaultMethodImpl implements DefaultInterface,DefaultInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodImpl dmi=new DefaultMethodImpl();
		dmi.m1();
		dmi.m2();
		

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DefaultInterface.super.m1();
	}
	public void m2() {
		// TODO Auto-generated method stub
		DefaultInterface1.super.m1();
	}

}
