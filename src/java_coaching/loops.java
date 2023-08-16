package java_coaching;
import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
	/*	int i=0;
		do
		{
			
			System.out.println(i);
			i++;
		}while(i<=5);*/
		
		for(int i=0;i<10;i++)
		{
		Scanner nagur = new Scanner (System.in);
		System.out.print("Enter Any Number: ");
		int sum =0;
		int number = nagur.nextInt();
		while (number != 0)
		{
			int last_digit = number%10;
			sum +=last_digit;
			number =number/ 10;
			
		}
		System.out.println("\nSum of the Entered Number is "+sum);}


	}

}
