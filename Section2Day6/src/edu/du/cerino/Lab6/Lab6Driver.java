package edu.du.cerino.Lab6;

public class Lab6Driver {

	public static void main(String[] args) {
		
		HockeyPlayer cap = new HockeyPlayer("Chad Johnson" , 3, HockeyPlayer.Position.CENTER);
		HockeyPlayer secondCap = new HockeyPlayer();
		HockeyPlayer capAwayGames = new HockeyPlayer(cap);
		
		System.out.println(cap);
		System.out.println(secondCap);
		System.out.println(capAwayGames);
		
		secondCap.setHockeyPlayer("Jason Davis", 7, HockeyPlayer.Position.GOALIE);
		System.out.println(secondCap);
		
		if(secondCap.equals(capAwayGames))
		{
			System.out.println(secondCap +" is the captain at away games");
		}
		else
		{
			System.out.println(secondCap + " is not the captain at away games");
		}
	}

}
