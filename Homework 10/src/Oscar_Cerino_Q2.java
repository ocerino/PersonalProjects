import java.util.Scanner;

public class Oscar_Cerino_Q2 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int year;
		int quit;
		
		do
		{
			do
			{
				System.out.println("Enter a year to check if it is a leap year.");
				year = userInput.nextInt();
				
				if(year<1582)
				{
					System.out.println("Leap years weren't a thing until 1582. Please input a year that is greater than or equal to 1582.");
				}
			}
			while(year<1582);
			
			if(1582 <year)
			{
				if(year%400 == 0)
				{
					System.out.println("It is a leap year!");
				}
				else if(year%400 != 0 && year%4 == 0)
				{
					System.out.println("It is a leap year!");
				}
				else
				{
					System.out.println("It is not a leap year!");
				}
			}
			System.out.println("Do you want to continue checking years? Enter a negative year to stop.");
			quit = userInput.nextInt();
		}while(quit>0);
	}
}
