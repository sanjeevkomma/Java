package com.demo.core.call_by_value;

public class CallBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A();
		
		obj.m1(obj);

		System.out.println(obj);

	}


}



class A {

	void m1(A a) {

		a = null;
	}



}
