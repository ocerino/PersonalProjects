package edu.du.cerino.Lab7;

public class Driver {

	public static void main(String[] args) {
		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		Apple apple = new Macintosh();

		// 4.
		if (fruit instanceof Fruit) {
			System.out.println("fruit is a Fruit");
		}
		// 5.
		if (fruit instanceof Orange) {
			System.out.println("fruit is a Orange");
		}
		// 6.
		if (fruit instanceof Apple) {
			System.out.println("fruit is a Apple");
		}
		// 7.
		if (fruit instanceof GoldenDelicious) {
			System.out.println("fruit is a GoldenDelicious");
		}
		// 8.
		if (fruit instanceof Macintosh) {
			System.out.println("fruit is a Macintosh");
		}
		// 9.
		if (orange instanceof Orange) {
			System.out.println("orange is a Orange");
		}
		// 10.
		if (orange instanceof Fruit) {
			System.out.println("orange is a Fruit");
		}
		// 11.
		if (apple instanceof Fruit) {
			System.out.println("apple is a Fruit");
		}
		// 12.
		if (apple instanceof GoldenDelicious) {
			System.out.println("apple is a GoldenDelicious");
		}
		// 13.
		//fruit.makeAppleCider();
		// 14.
		orange.makeAppleCider();
		// 15.
		apple.makeAppleCider();
		// 16.
		orange.makeOrangeJuice();
		fruit.makeOrangeJuice();
		// 17.
		Orange p = new Apple();
		// 18.
		Macintosh m = new Apple();
		// 19.
		Apple a = new Macintosh();
		
	}

}
