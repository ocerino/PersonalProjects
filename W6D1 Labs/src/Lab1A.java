import java.util.Scanner;
public class Lab1A 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int userAge;
		int quit;
		do
		{
			do
			{
				System.out.println("How old are you?");
				userAge = userInput.nextInt();
				
				if(userAge<0 || userAge >125)
				{
					System.out.println("That can't even be possible. Please put in a different value");
				}
			}
			while(userAge<0 || userAge>125);
			
			if(0 <userAge && userAge<125)
			{
				System.out.println("That's a correct value.");
				if(userAge>=18)
				{
					System.out.println("You are old enough to vote!");
				}
				if(userAge<18)
				{
					System.out.println("Sorry, " + userAge +" is too young to vote. You need to wait " + (18-userAge) + " years to vote.");
				}
				if(userAge>95)
				{
					System.out.println("But how are you still alive? And why are you voting? This isn't going to affect your future!");
				}
			}
			System.out.println("Do you want to continue checking people's age? Press -1 to stop.");
			quit = userInput.nextInt();
			
		}while(quit != -1);
	}
}