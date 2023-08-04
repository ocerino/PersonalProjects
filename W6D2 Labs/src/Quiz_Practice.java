import java.util.Scanner;


public class Quiz_Practice 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your how many feet tall you are");
		int s1 = kb.nextInt();
		System.out.println("Please enter how many inches tall you are");
		int s2 = kb.nextInt();
		System.out.println("You entered that you are " + s1 + " feet and " + s2 + " inches tall. That is equivilant to " + (s1*30.48 + s2*2.54) + " centimeters.");
		
		System.out.println("Please enter how many centimeters tall you are");
		float s3 = kb.nextFloat();
		System.out.println("That is equivlant to " + (int) (s3/30.48) + " feet and " + (int) ((s3%30.48)/2.54) + " inches.");
		
	}
}
