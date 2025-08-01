
public class PlayingCard 
{
	private int cardValue;
	private int cardSuit;
	private String suitName;
	
	//Default Constructor for Playing Card
	public PlayingCard()
	{
		this.cardSuit = 1;
		this.cardValue = 1;
	}
	
	//Consturctor that takes in a set card value and card suit
	public PlayingCard(int cv, int cs)
	{
		this.cardValue = cv;
		this.cardSuit = cs;
	}
	
	
	//gets card value of the object
	public int getValue()
	{
		return this.cardValue;
	}
	
	//gets card suit of the object
	public int getSuit()
	{
		return this.cardSuit;
	}
	
	//sets how card will be read by default
	public String toString()
	{
		
		if(this.cardSuit == 1)
		{
			suitName = "Clubs";
		}
		else if(this.cardSuit == 2)
		{
			suitName = "Diamonds";
		}
		else if(this.cardSuit == 3)
		{
			suitName = "Hearts";
		}
		else if(this.cardSuit == 4)
		{
			suitName = "Spades";
		}
		else
		{
			suitName = "Invalid";
		}
		if(this.cardValue == 1)
		{
			return "Ace of " + this.suitName;
		}
		else if(2<=this.cardValue && 10>=this.cardValue)
		{
			return this.cardValue + " of " + this.suitName;	
		}
		else if(this.cardValue == 11)
		{
			return "Jack of " + this.suitName;
		}
		else if(this.cardValue == 12)
		{
			return "Queen of " + this.suitName;
		}
		else if(this.cardValue == 13)
		{
			return "King of " + this.suitName;
		}
		else
		{
			return "Invalid card";
		}
	}
}
