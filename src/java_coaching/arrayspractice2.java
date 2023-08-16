package java_coaching;

import java.util.Arrays;
import java.util.Scanner;

public class arrayspractice2 {

	public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
     
     System.out.println("Enter the Size of an Array: ");
     int arrSize = sc.nextInt();
     
     boolean[] arr = new boolean[arrSize];
     
     System.out.println("Enter the values of an Array: ");
     
     for (int i=0;i<arr.length;i++) {
    	 
    	 arr[i]= sc.nextBoolean();
    	 
     }
     
     System.out.println("Output: "+Arrays.toString(arr));
     
     boolean[] rearr = new boolean[arrSize];
     
     for (int i=0;i<arr.length;i++) {
    	 
    	 rearr[i]=arr[arr.length-i-1];
     }
     
     System.out.println("Reverse Array: "+Arrays.toString(rearr));
     
     sc.close();
     
     
     
	}

}
