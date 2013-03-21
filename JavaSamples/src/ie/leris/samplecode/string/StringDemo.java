package ie.leris.samplecode.string;

public class StringDemo {

	/**
	 * various ways to create and manipulate a string
	 */
	public static void main(String[] args) {

		/**
		 * Create a string object with no value, then assign a value
		 */
		String s1 = new String();
		s1 = "my first string";

		/**
		 * Regular way to create a string object and assign a value
		 */
		String s2 = new String("my second string");

		/**
		 * Shorthand string creation and assignment
		 */
		String s3 = "my third string";

		/**
		 * Print out the value of a string
		 */
		System.out.println("The value of s1 is - " + s1);

		/**
		 * Create a second reference variable pointing to the same string object
		 */
		String myString = s1;
		System.out.println("The value of the second reference to s1 is - "
				+ myString);
		/**
		 * Append additional value to a string, this creates a new string
		 */
		s1 = s1.concat(" with an appended value");
		System.out.println("The value of s1 after concat - " + s1);
		System.out
				.println("The value of second reference to s1 after concat - "
						+ myString);

		System.out.println("The value of the second string is " + s2);
		System.out.println("The value of the third string is " + s3);

		/**
		 * Example of toUpperCase()
		 */
		String x = "Java";
		System.out.println("The value of X is " + x);
		String x1 = x.toUpperCase();
		System.out
				.println("After using toUpperCase(), the value of X is " + x1);

	}

}
