package com.intefaces;

public class Dell implements laptop {

	@Override
	public void copy() {
       
		System.out.println("Dell Copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Dell paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Dell Cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Dell keyboard code");
		
	}

}
