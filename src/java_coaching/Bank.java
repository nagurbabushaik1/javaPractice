package java_coaching;

public class Bank {
	static int currentBalance = 10000;

	public static void greetCustomer() {
		System.out.println("Hello! Welcome to the SBI");
	}
	public void deposit (int amount)	{
		currentBalance = currentBalance + amount;
		System.out.println("Amount Deposit successfully");

	}
	public static void withdraw(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount withdrawn successfully");

	}
	public int getbalance() {

		return currentBalance;
	}

	public static void main(String[]args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("Current Balance is: "+ bank. getbalance());

		bank. deposit(10000);
		System.out.println("Current Balance is: "+ bank. getbalance());

		withdraw(5000);
		System.out.println("Current Balance is: "+ bank. getbalance());


	}

}
