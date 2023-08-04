package edu.du.cerino.Lab11;

import java.util.Scanner;

public class DateConverter {

	private static final String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public static void main(String[] args) {
		int m;
		int d;
		boolean done = false;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Would you like to convert a date? Enter Y or N");

			String input = keyboard.nextLine();

			if (input.charAt(0) == 'Y') {
				done = false;
			} else {
				done = true;
				System.exit(0);
			}
			System.out.println("Enter the number of the month you would like to convert");
			m = keyboard.nextInt();
			System.out.println("Enter the number of the day you would like to convert");
			d = keyboard.nextInt();
			try {
				System.out.println(convert(m, d));
			} catch (MonthException e) {
				System.out.println(e.getMessage());
			} catch (DayException e) {
				System.out.println(e.getMessage());
			}
			keyboard.nextLine();
		} while (!done);
		keyboard.close();

	}

	public static String convert(int m, int d) throws DayException, MonthException {
		if (m > 12 || m < 1) {
			throw new MonthException(m);
		} else if (m % 7 % 2 == 1 && m != 2 && d >= 1 && d <= 31) {
			return MONTHS[m - 1] + " " + d;
		} else if (m % 7 % 2 == 0 && m != 2 && d >= 1 && d <= 30) {
			return MONTHS[m - 1] + " " + d;
		} else if (m == 2 && d >= 1 && d <= 28) {
			return MONTHS[m - 1] + d;
		} else {
			throw new DayException(d);
		}

	}
}
