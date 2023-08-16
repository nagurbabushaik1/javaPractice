package com.intefaces;

public interface laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		
		System.out.println("security code");
		
	}
	
	static void audio() {
		
		System.out.println("Audio code");
	}
	


}
