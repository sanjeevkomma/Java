package com.demo.core.call_by_value;

public class CallByReferenceTest {

	public static void main(String[] args) {

		Test t1 = new Test(30);

		Test t2 = new Test(45);

		System.out.println("Before swapping, a = " + t1.a + " and b = " + t2.a);

		swapFunction(t1, t2);

		System.out.println("\n**Now, Before and After swapping values will be different here**:");

		System.out.println("After swapping, a = " + t1.a + " and b is " + t2.a);

	}

	public static void swapFunction(Test t1, Test t2) {

		System.out.println("Before swapping(Inside), a = " + t1.a + " b = " + t2.a);

		Test t3 = new Test(t1.a);

		t1.a = t2.a;

		t2.a = t3.a;

		System.out.println("After swapping(Inside), a = " + t1.a + " b = " + t2.a);

	}

}

class Test {

	public int a;

	public Test(int a){

		this.a = a;

	}

}