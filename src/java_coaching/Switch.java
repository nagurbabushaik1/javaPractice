package java_coaching;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner nagur = new Scanner(System.in);
		System.out.print("Who is the prime minister of India?\n1)Pranab Mukharji\n2)Narendra Modi\n3)Gandhi\n4)Javaharlal Nehru\nChoose Option: ");
		int a = nagur.nextInt();
		switch (a)
		{
		case 1:
			System.out.println("Wrong Answer!");
			break;
		case 2:
			System.out.println("Right Answer!");
			break;
		case 3:
			System.out.println("Wrong Answer");
			break;
		case 4:
			System.out.println("Wrong Answer!");
			break;
		default:
			System.out.println("Entered Input is incorrect");
			break;
		}
		
		


	}

}
