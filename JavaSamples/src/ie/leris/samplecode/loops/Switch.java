package ie.leris.samplecode.loops;

import java.util.Scanner;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a number between 1 & 5");
		Scanner myScanner = new Scanner(System.in);
		int x = myScanner.nextInt();

		switch (x) {
		case 1:
			System.out.println("This is not the correct number");

			break;
		case 2:
			System.out.println("This is not the correct number");

			break;
		case 3:
			System.out.println("This is not the correct number");

			break;
		case 4:
			System.out.println("This is not the correct number");

			break;
		case 5:
			System.out.println("This is the correct number");

			break;

		default:
			System.out.println("The number was not between 1 & 5");
			break;
		}

	}

}
