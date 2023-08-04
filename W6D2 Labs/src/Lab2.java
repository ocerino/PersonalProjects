import java.util.Scanner;

public class Lab2 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Type a sentence");
		String s = kb.nextLine();
		int numWords = 0;
		for(int i=0; i<s.length(); i ++)
		{
			if(s.charAt(i) == ' ')
			{
				numWords ++;
			}
			
		}
		System.out.println("That sentence is " + numWords + " words long");
		
	}
}
