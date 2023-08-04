import java.util.Scanner;

public class Question3 
{

	public static void main(String[] args) 
	{
		String [] s = new String [10];
		int i = 0;
		Scanner kb = new Scanner(System.in);
		do
		{
			System.out.println("Please enter any word of your choosing");
			s[i] = kb.nextLine();
			i++;
		}while(i<10);
		for(i=0;i<5;i++)
		{
			int a = (int) (Math.random()*10);
			System.out.println(s [a]);
		}
	}

}
