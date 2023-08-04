import java.util.Scanner;

public class Project_3 
{
	
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int playerNum = 1;
		int [] binNum = new int [5];
		int numOfBin;
		int numMatchesWantRemoved;
		
		System.out.println("The Bins: This two player game requires you to choose a bin, numbered 1 to 5, and then choose how many matches you want to remove.");
		System.out.println("	  The game goes on until the last match is removed, and the player who removed it loses.");
		System.out.println();
		for(int i=0;i<5;i++)
		{
		binNum[i] = 7;
		}
		
		while(checkGameEnd(binNum))
		{
			if(playerNum>2)
			{
				playerNum = 1;
			}
			System.out.println(" " + binNum[0] + "	 " + binNum[1] + "	 " + binNum[2] + "	 " + binNum[3] + "	 " + binNum[4] + " ");
			System.out.println("|_|	" + "|_|	" + "|_|	" + "|_|	" + "|_|	");
			System.out.println("Player " + playerNum + "'s turn: choose a bin");
			numOfBin = kb.nextInt();
			numOfBin -= 1;
			while(numOfBin>4 || numOfBin<0 || binNum[numOfBin] == 0)
			{
				System.out.println("That isn't a bin you can choose. Please enter a different number");
				 numOfBin= kb.nextInt();
				 numOfBin -= 1;
			}
			System.out.println("Choose how many matches to remove");
			numMatchesWantRemoved = kb.nextInt();
			playerNum ++;
			do
			{
				while(numMatchesWantRemoved>binNum[numOfBin] || numMatchesWantRemoved<=0)
				{
					System.out.println("You can't take out that many matches. Please enter a different amount.");
					numMatchesWantRemoved = kb.nextInt();
				}
				if(numMatchesWantRemoved<=binNum[numOfBin])
				{
					binNum[numOfBin] -= numMatchesWantRemoved;
				}
			}while(removeMatches(numOfBin,numMatchesWantRemoved,binNum));
		}
		if(playerNum >= 2)
		{
			playerNum -= 1;
		}
		System.out.println("Player " + playerNum + " loses! :(");
	}
	
	public static boolean removeMatches(int numOfBin,int numMatchesWantRemoved,int [] binNum)
	{
		if(numMatchesWantRemoved>binNum[numOfBin] || numMatchesWantRemoved<=0)
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}
	
	public static boolean checkGameEnd(int [] binNum)
	{
		if(binNum[0] == 0 && binNum[1] == 0 && binNum[2] == 0 && binNum[3] == 0 && binNum[4] == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}