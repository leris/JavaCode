package ie.leris.samplecode.loops;

import java.util.Scanner;

public class IfElse {

		public static void main(String[] args) {

			System.out.println("Please enter a number between 1 & 5");
			Scanner myScanner = new Scanner(System.in);
			int x = myScanner.nextInt();

			if (x == 5) {
				System.out.println("You guessed the correct number.");
			}else{
				System.out.println("You did not guess the correct number.");
			}
		}

	}
