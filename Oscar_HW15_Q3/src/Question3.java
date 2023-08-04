import java.util.Scanner;

public class Question3 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to check if it's prime");
		int integer = kb.nextInt();
		System.out.println("The integer is prime: "+ isPrime(integer));
		System.out.println("All the prime numbers leading up to and possibly including your number are:");
		
		for(int i = 2;i<= integer;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime(int i)
	{
		if(i%1 == 0 && i%i == 0 && i%2!=0 && i%3!=0 && i%4!=0 && i%5!=0 && i%6!=0 && i%7!=0 && i%8!=0 && i%9!=0)
		{
			return true;
		}
		else if(i == 2 || i == 3 || i == 5 || i == 7)
		{
			return true;
		}
		return false;
	}
}
