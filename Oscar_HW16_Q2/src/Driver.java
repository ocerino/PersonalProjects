
public class Driver {

	public static void main(String[] args) {
		PlayingCard aceOfClubs = new PlayingCard();
		PlayingCard twoOfClubs = new PlayingCard(2,3);
		
		System.out.println(aceOfClubs.toString());
		System.out.println(twoOfClubs.toString());

	}

}
