import java.util.Scanner;

public class Question2 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence about something you hate");
		String s = kb.nextLine().toLowerCase().replaceAll("hate", "love");
		int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println("There were "+ count + " vowels in your sentence");
		System.out.println(s);
		
	}

}
