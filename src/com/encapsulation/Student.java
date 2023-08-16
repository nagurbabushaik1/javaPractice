package com.encapsulation;

public class Student {
	
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	
	
	public void setStudentAttendence (boolean flag) {
		
		System.out.println("Teacher taken attendence");
		
	}
	
	public boolean getStudentAttendence(){
		System.out.println("teacher get the student attendence");
		
		return isAttended;
		
	}
	
	

}
