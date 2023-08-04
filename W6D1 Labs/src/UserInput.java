import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many pieces of candy do you have?");
		int numPieces = userInput.nextInt();
		
		System.out.println("How many people are there?");
		int numPeople = userInput.nextInt();
		
		System.out.println("Each person gets " + (numPieces/numPeople) + " pieces and you have " + (numPieces%numPeople) + " pieces left");
	}

}
