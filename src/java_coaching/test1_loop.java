package java_coaching;

import java.util.Scanner;

public class test1_loop {

	public static void main(String[] args) {
		int sum=0;
		float avg;
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt();


		sum= a1+a2+a3+a4+a5;
		avg = sum/5;

		System.out.println("Sum of the given numbers is: "+sum);
		System.out.println("Avg of the given numbers is: "+avg);

/*
		int n ;
		Scanner  sc = new Scanner(System.in);
		System.out.println("input the number of terms: ");
		n = sc.nextInt();

		for (int i =1;i<=n;i++) {
			System.out.println("The number is "+i+" The cube of the number is "+i*i*i);

			Scanner  sc = new Scanner(System.in);
			System.out.println("Input the Number: ");
			int n = sc.nextInt();
			int j;

			for (int i =0;i<11;i++) {
				j = n*i;

				System.out.prinln(n+" X "+i+" = "+j);
			}*/



		}

	}
