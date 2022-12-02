import java.util.Scanner;

public class SUBPROGRAMS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Input Two Strings

		System.out.println("What is the first string:");

		String Uno = in.next();

		// Use textual divider for simplicity

		System.out.println("---------------");

		System.out.println("What is the second string:");

		String Dos = in.next();

		System.out.println(combine(Uno, Dos));

		// Use textual divider for simplicity

		System.out.println("---------------");

	}

	// Mixture of both Strings

	public static String combine(String Uno, String Dos) {

		String Tres = "";

		for (int i = 0; i < Math.max(Uno.length(), Dos.length()); i++) {

			if (i < Uno.length()) {

				Tres += Uno.charAt(i);

			}

			Tres += Dos.charAt(i);

		}

		// Print the results

		return Tres;

	}

}
