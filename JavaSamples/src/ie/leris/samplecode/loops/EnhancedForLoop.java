package ie.leris.samplecode.loops;

public class EnhancedForLoop {

	public static void main(String[] args) {

		int j = 0;
		int [] squares={0,1,4,9,16,25};
		for(int i : squares){
			System.out.printf("%d squared is %d.\n", j++, i);
		}	
	}

}
