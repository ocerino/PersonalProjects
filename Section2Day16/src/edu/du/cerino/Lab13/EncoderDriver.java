package edu.du.cerino.Lab13;

public class EncoderDriver {

	public static void main(String[] args) {
		//shift cipher test code
		ShiftCipher test = new ShiftCipher(3);
		String testMessage = new String("facetiously");
		System.out.println(testMessage);
		System.out.println(test.encode(testMessage));
		//shuffle cipher test code
		ShuffleCipher shuffleTest = new ShuffleCipher(2);
		System.out.println(testMessage);
		System.out.println(shuffleTest.encode(testMessage));

	}

}
