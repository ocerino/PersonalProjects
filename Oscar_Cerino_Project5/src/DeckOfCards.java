
public class DeckOfCards 
{
	private PlayingCard[] deck = new PlayingCard[52];
	private int cardsDealt = 0;
	
	//Default Constructor for DeckOfCards
	public DeckOfCards()
	{
		int i = 0;
		for(int j=1;j<5;j++)
		{
			for(int k=1;k<14;k++)
			{
				deck[i] = new PlayingCard(k%14,j%5);
				i++;
			}
		}
		
	}
	
	//shuffles the deck of cards
	public void shuffle()
	{
		for(int i=0;i<deck.length;i++)
		{
			int j = (int)(Math.random()*52);
			PlayingCard temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
	}
	
	//deals out the next card
	public PlayingCard dealNextCard()
	{
		int card = cardsDealt;
		cardsDealt++;
		return deck[card];
	}
	
	//returns how many cards are left in the deck
	public int cardsRemaining()
	{
		return 52 - cardsDealt;
	}
	
	//sets how deck will be read by default
	public String toString()
	{
		String cardsInDeck = "";
		for(int i=cardsDealt;i<deck.length -1;i++)
		{
			cardsInDeck  += this.deck[i] + ", ";
		}
		cardsInDeck += this.deck[51];
		return cardsInDeck;
	}
	
	
	
}
