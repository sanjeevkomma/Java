package com.demo.lambda_expression;

public class LambdaExpression_Thread_Example {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			public void run() {
				
				System.out.println("thread r1 running");
			}
			
		};
		
		Thread t1 = new Thread( r1 );
		
		t1.start();
		
		Runnable r2 = ( ) -> { System.out.println("thread t2 running using lamba"); } ; 
		
		Thread t2 = new Thread( r2 );
		
		t2.start();
		
	}

}
