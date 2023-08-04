import java.util.Scanner;

public class Quiz_Practice2 
{
	public static void main(String[] args)
	{
		int [] integers = new int [8];
		int product = 1;
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i <=7;i++)
		{
			System.out.println("Please enter any number of your choosing");
			integers[i] = kb.nextInt();
			product *= integers[i];
		}
		System.out.println(product); 
		
		
		
		
		
		String [] s = new String [10];
		int i = 0;
		do
		{
			System.out.println("Please enter any word of your choosing");
			s[i] = kb.nextLine();
			i++;
		}while(i<10);
		System.out.println("The words you entered were " + s[i-1] + ", " + s[i-2] + ", " + s[i-3] + ", " + s[i-4] + ", " + s[i-5] + ", " + s[i-6] + ", "+ s[i-7] + ", " + s[i-8] + ", " + s[i-9] + ", and "+ s[i-10]);
	}
}
