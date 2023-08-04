import java.util.Scanner;

public class Driver 
{
	
	
	public static void main(String[] args) 
	{
		
		DeckOfCards deck = new DeckOfCards(); //creates new deck of cards
		PlayingCard playersCard; //declares a variable that holds the players card
		PlayingCard dealersCard; //declares a variable that holds the dealers card
		int guess; //declares a variable that holds what the player guesses
		int quit; //declares a variable that holds a number to check to quit the game
		int playersScore = 0; //declares and initializes the players score to 0
		int dealersScore = 0; //declares and initializes the dealers score to 0
		Scanner userInput = new Scanner(System.in);
		
		deck.shuffle();//shuffles the deck into a random order
		
		System.out.println("War: This is a card game in which you, the player, play against the dealer. You draw a card and if the value of the card is higher than the dealer's you win." + "\n Otherwise, you lose. You can guess whether you are going to win or not and if you guess correctly then you score the point for the round.");
		//provides instructions of the game
		
		do
		{
			playersCard = deck.dealNextCard();//deals the next card to player
			dealersCard = deck.dealNextCard();//deals the next card to dealer
			System.out.println("Your card is: " + playersCard); //shows player what their card is
			
			System.out.println("Do you think you'll win this round or the dealer? Enter 1 for you and enter 2 for the dealer");
			guess = userInput.nextInt();		
			//allows for the player to guess whether they will win or lose the round
			
			System.out.println("The dealer's card is: " + dealersCard);//shows the dealer's card
			
			//outputs a message based on what the value of the player and dealer's card are
			if(playersCard.getValue()==1 && dealersCard.getValue()!=1 )
			{
				System.out.println("You win this round! :D");
				playersScore++;
			}
			else if(dealersCard.getValue()==1 && playersCard.getValue()!=1)
			{
				System.out.println("You lose this round! :(");
				dealersScore++;
			}
			else if(playersCard.getValue()<dealersCard.getValue())
			{
				System.out.println("You lose this round! :(");
				
			}
			else if(playersCard.getValue()==dealersCard.getValue())
			{
				System.out.println("It's a tie! No one wins this round!");
			}
			else if(playersCard.getValue()>dealersCard.getValue())
			{
				System.out.println("You win this round! :D");
				
			}
			
			//outputs a message and increases the score of the player or of the dealer based on whether the guess was correct or not 
			if(isGuessCorrect(guess, playersCard, dealersCard) == true)
			{
				System.out.println("Your guess was correct! You score the point for this round! :D");
				playersScore++;
			}
			else
			{
				System.out.println("Your guess was incorrect! The dealer scores the point for this round! :(");
				dealersScore++;
			}
			System.out.println("The are " + deck.cardsRemaining() +  " cards remaining");//shows how many rounds/cards are left
			System.out.println("Your score is: "+ playersScore); //shows player's score
			System.out.println("The dealer's score is: " + dealersScore);//shows dealer's score
			
			//allows for player to continue game if they want to
			System.out.println("Would you like to continue? If so enter a positive number, if not enter a negative number.");
			quit = userInput.nextInt();
			
		}while(deck.cardsRemaining() >0 && quit>0);
		
		if(playersScore<dealersScore)
		{
			System.out.println("You lost the game! :(");
		}
		if(playersScore==dealersScore)
		{
			System.out.println("It was a tie! No one wins!");
		}
		if(playersScore>dealersScore)
		{
			System.out.println("You won the game! :D");
		}	
	}
	
	//method for checking if guess is correct
	public static boolean isGuessCorrect(int guess, PlayingCard pc, PlayingCard dc)
	{
		Scanner userInput = new Scanner(System.in);
		while(guess>2)
		{
			System.out.println("That is an invalid guess. Please guess again.");
			guess = userInput.nextInt();
		}
		if(guess == 1 && (pc.getValue()>dc.getValue() || pc.getValue() == 1) || guess == 2 && (pc.getValue()<dc.getValue() || dc.getValue() == 1))
		{
			return true;
		}
		return false;
	}
}
