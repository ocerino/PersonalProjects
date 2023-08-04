
public class Driver 
{

	public static void main(String[] args) 
	{
		Date electionDay = new Date();
		System.out.println("Not election day: " + electionDay.toString());
		
		electionDay.setDate(11, 6, 2018);
		System.out.println("Election day: " + electionDay.toString());
		
		System.out.println(electionDay.isLeapYear());
		
		Date leapYear = new Date(1,1,2000);
		if(leapYear.isLeapYear())
		{
			System.out.println("It's a leap year!!");	
		}
		else
		{
			System.out.println("It's NOT a leap year!");
		}
		
		System.out.println(electionDay.isHalloween());
		System.out.println("Today is day " + electionDay.dayOfYear());
	}
}
