package ie.leris.samplecode.loops;

import java.util.Scanner;

public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean isCorrect = false;

		do {
			System.out.println("Please enter a number between 1 & 5");
			Scanner myScanner = new Scanner(System.in);
			int x = myScanner.nextInt();

			if (x != 5) {
				System.out
						.println("That is not the correct number,\nPlease guess again.\n");
				isCorrect = false;

			} else {
				System.out.println("You guessed the correct number");
				isCorrect = true;

			}

		} while (isCorrect != true);

	}

}
