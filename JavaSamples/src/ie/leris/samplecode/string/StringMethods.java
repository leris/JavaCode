package ie.leris.samplecode.string;

public class StringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * charAt() returns a char located at a specific index
		 */
		String x = "airplane";
		System.out
				.println("charAt()\n    String x = \"airplane\"; \n    x.charAt(2);\nAbove code returns "
						+ x.charAt(2));

		/**
		 * concat() apends one string onto the end of another, + and += work
		 * aswell
		 */
		String x1 = "taxi";
		System.out
				.println("\nconcat()\n    String x1 = \"taxi\"; \n    x1.concat(\" cab\");\nAbove code returns -  "
						+ x1.concat(" cab"));

		String x2 = "libarary";
		System.out
				.println("\n'+ operator'\n    String x2 = \"library\";\n    x2 + \" card\";\nAbove code returns - "
						+ x2 + " card");

		String x3 = "Atlantic";
		System.out
				.println("\n'+= operator'\n    String x3 = \"Atlantic\";\n    x3 + \" Ocean\";\nAbove code returns - "
						+ x3 + " Ocean");

		/**
		 * equalsIgnoreCase() determines the equality of two strings ignoring
		 * case
		 */
		System.out.println("\nequalsIgnoreCase");
		String x4 = "Exit";
		System.out.println("    equalsIngoreCase() where strings match = "
				+ x4.equalsIgnoreCase("Exit"));
		System.out.println("    equalsIngoreCase() where strings dont match = "
				+ x4.equalsIgnoreCase("tixe"));
		String x5 = "Exit";
		System.out
				.println("    equalsIgnoreCase() between two string objects = "
						+ x4.equalsIgnoreCase(x5));

		/**
		 * length() returns the number of characters in a String
		 */
		String x6 = "1234567";
		System.out
				.println("\nlength()\n    String x6 = \"1234567\";\n    x6.length();\nAbove code returns - "
						+ x6.length());
		/**
		 * replace() replaces occurrences of a character with a new character
		 */
		String x7 = "xoxoxox";
		System.out.println("\nreplace()\n    String x7 = \"xoxoxox\";\n    x7.replace('x','X');\nAbove code returns - " + x7.replace('x','X'));
				

		/**
		 * substring() returns part of a string
		 */
		String x8 = "0123456789";
		System.out.println("\nsubstring()\n    String x8 = \"0123456789\";\n    x8.substring(5);\nAbove code returns - " + x8.substring(5));
		
		
		
		
		/**
		 * toLowerCase() returns a string with all uppecase characters converted
		 */

		/**
		 * toString() returns the value of a string
		 */

		/**
		 * toUpperCase returns a string with all lowercase characters converted
		 */

		/**
		 * trim
		 */
	}
}
