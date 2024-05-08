package desofexceptionanderrorhandling;

public class ArrayAndStringIndexOutOfBoundaryProg {

	public static void main(String[] args) {
		// Commented out the code for demonstration purposes
		int a[] = new int[5];

		try {
			a[5] = 7;
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		// Calling the EH2 method
		EH2();
	}

	public static void EH2() {
		String str = "Welcome";

		try {
			System.out.println(str.charAt(8)); // Accessing index 8 in "Welcome" string
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
