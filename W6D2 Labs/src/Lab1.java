import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Type your first name and middle name if you have one");
		String s = kb.nextLine();
		System.out.println("You typed: " + s + " and it is " + s.length() + " characters long");
		System.out.println("Type your last name");
		String s2 = kb.nextLine();
		System.out.println("You typed: " + s2 + " and it is " + s2.length() + " characters long");
		System.out.println("Welcome " + s + " " + s2 + "!");
	}

}
