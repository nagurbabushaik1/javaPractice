package java_coaching;

import java.util.Scanner;

public class nagur {

	public static void main(String[] args) {
		int i ;
		Scanner sc = new Scanner(System.in);
		for (i=1;i<=10;i++) {
        System.out.print("Enter one number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("Sum of the Entered Numbers is: "+(a+b));
        
		}
	}

}
