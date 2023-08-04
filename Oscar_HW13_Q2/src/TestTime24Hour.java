import java.util.Scanner;

public class TestTime24Hour 
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Time24Hour quittingTime = new Time24Hour(17,0);
		Time24Hour now = new Time24Hour();
		int hours, minutes;
		
		System.out.println("Please enter the time in hours (24-hour clockfollowed by minutes)");
		hours = keyboard.nextInt();
		minutes = keyboard.nextInt();
		if (now.setTime(hours, minutes))
		{
			System.out.println("The time is now " + now);
			if (now.equals(quittingTime))
			{
				System.out.println("It's quitting time!");
			}
			else if (now.precedes(quittingTime))
			{
				System.out.println("It's not quitting time yet.");
			}
			else
			{
				System.out.println("It's past quitting time!");
			}
		}
		else
		{
				System.out.println("That is not a valid time");
		}
	}

}
