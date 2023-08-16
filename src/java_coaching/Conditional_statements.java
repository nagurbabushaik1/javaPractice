package java_coaching;
import java.util.Scanner;

public class Conditional_statements {

	public static void main(String[] args) 
	{
		
		{
		Scanner nagur = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		int number = nagur.nextInt();
		if (number>0)
		{
			System.out.println("This is a Positive Number");
		}
		else if (number==0)
		{
			System.out.println("This is Zero");
		}
		else
		{
			System.out.println ("This is a Negetive Number");
		}
		
		}
	}
}
