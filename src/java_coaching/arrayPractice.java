package java_coaching;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int arr1Size = sc.nextInt();
		
		String[]arr1 = new String[arr1Size];

		System.out.println("Enter arry Values: ");

		for (int i=0;i<arr1.length;i++) {
			arr1[i] = sc.next();
		}
//		int largestNumber =0;
//		int index =0;
//		for(int i=0;i<arr.length;i++) {
//			if (largestNumber<arr[i]) {
//				largestNumber =arr[i];
//				index = i;
//
//			}
          
	//	}
		System.out.print("Enter the size of an Array: ");
		int arr2Size = sc.nextInt();

		String[]arr2 = new String[arr2Size];

		System.out.println("Enter arry Values: ");

		for (int i=0;i<arr2.length;i++) {
			arr2[i] = sc.next();
		}
		System.out.println("Output: "+Arrays.toString(arr1));
		System.out.println("Output: "+Arrays.toString(arr2));
		
		int arr3Size = arr1Size+arr2Size;
		
		String [] arr3 = new String[arr3Size];
		
		for (int i=0;i<arr1.length;i++) {
			arr3[i]= arr1[i];
		}
		
		for ( int i=0;i<arr2.length;i++) {
			
			arr3[i+arr1.length]=arr2[i];
		}
       
		System.out.println("Output: "+Arrays.toString(arr3));
		
		String minLengthWord =arr3[0];
		int index =0;
		for(int i=0;i<arr3.length;i++) {
			if (minLengthWord.length()>arr3[i].length()) {
				 minLengthWord=arr3[i];
				index = i;
	}
		}


System.out.println("Largest Number of an Array: "+minLengthWord);
	System.out.println("Index: "+index);
	}

	}
