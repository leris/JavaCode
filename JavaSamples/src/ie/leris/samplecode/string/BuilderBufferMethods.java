package ie.leris.samplecode.string;

public class BuilderBufferMethods {

	public static void main(String[] args) {

		/**
		 * append() update the value of the object that invoked the metohd
		 */
		StringBuffer sb = new StringBuffer("Set ");
		sb.append(" Point");
		System.out.println(sb);
		
		/**
		 * delete() removes a substring from the original string
		 */
		StringBuffer sb1 = new StringBuffer("1234567890");
		sb1.delete(4, 6);
		System.out.println(sb1);
		
		/**
		 * insert() a value at a specified ofset
		 */
		StringBuffer sb2 = new StringBuffer("1234567890");
		sb2.insert(4, "---1");
		System.out.println(sb2);
		
		/**
		 * reverse() takes an object and returns the reverse
		 */
		StringBuilder sb3 = new StringBuilder("Nine Inch Nails");
		sb3.reverse();
		System.out.println(sb3);
	
	/**
	 * toString() returns the value of the object
	 */
		StringBuffer sb4 = new StringBuffer("This is a StringBuffer Object");
		System.out.println(sb4.toString());
	
	
	}
	
	

}
