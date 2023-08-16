package com.encapsulation;

public class exceptionHandling {

	public static void main(String[] args) throws ArithmeticException {

		exceptionHandling eh = new exceptionHandling();
		eh.divide2();
	}
	
	public void divide2() {
		exceptionHandling eh = new exceptionHandling();

		
		eh.divide();
		
	}
	
	public  void divide(){
		
		System.out.println("Program execution starts");
		
		int a =5;
		int b =0;
		int result = 0;
	try {	
		result = a/b; }
	catch(ArithmeticException ae){
		
		System.out.println(ae.toString());
		throw ae;
	}
	finally {
		System.out.println("Waste ");
	}
		
		System.out.println("Result: "+result);
		System.out.println("Program execution end");
		
	}
	
	
	}


