package edu.du.cerino.Lab15;

public class Lab15Driver 
{

	public static void main(String[] args) 
	{
		Art first = new Art("Mona Lisa","Leonardo da Vinci");
		first.addTag("Most famous piece");
		Art second = new Art("The Creation of Adam","Michelangelo");
		second.addTag("Centerpiece of Sistine Chapel's roof");
		Art third = new Art("The Last Judgement","Michelangelo");
		third.addTag("Largest piece in Sistine Chapel");
		
		Gallery louvre = new Gallery();
		louvre.addPiece(first);
		louvre.addPiece(second);
		louvre.addPiece(third);
		louvre.printCollection();
		System.out.println(louvre.numberBy("Michelangelo"));
		System.out.println(louvre.numberMatching("Most famous piece"));
	}
}
