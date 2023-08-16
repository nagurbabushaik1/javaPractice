package java_coaching;

import java.util.Scanner;

public class scannerClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		greetCustomer();
		System.out.print("What is your name: ");
		String name = scanner.nextLine();
		System.out.printf("Hi,%s How are you: ",name);
		String status = scanner.nextLine();
		System.out.print("What is your Age: ");
		int age = scanner.nextInt();
		System.out.println("Thank you for the information!");
		scanner.close();
	}
	public static void greetCustomer() {
		System.out.println("Hi! Welcome ");
	}
}
