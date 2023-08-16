package com.intefaces;

public class lenovo implements laptop {

	@Override
	public void copy() {
       
		System.out.println("lenovo Copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("lenovo paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("lenovo Cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("lenovo keyboard code");
		
	}
	
	public void print() {
		System.out.println("lenovo print code");
		
	}
	
	public void security() {
		
		System.out.println("security code");
	}
	
	
}
