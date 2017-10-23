import java.util.Scanner;

public class Lab2 {

	public static void main(String args[]) {

		Scanner scnr = new Scanner(System.in);
		char contGame = 'y';

		System.out.println("Please enter your name:");
		String userName = scnr.next();

		System.out.println("Please enter an integer between 1 and 100");
		int userInput = scnr.nextInt();
		// gives user the option to continue playing
		while (contGame == 'y') {

			// this condition is either / or hence the
			if (userInput % 2 == 0) {
				System.out.print("Even ");
			} else {
				System.out.print("Odd ");
			}
			if (userInput < 26) {
				System.out.print("and less than 25 ");
			}
			if (userInput > 59) {
				System.out.print("and over 60 ");
			}
			System.out.println();
			System.out.println("Would you like to continute to play? (y/n)");
			// this checks the char at the beginning of the statement, accepts yes as well y
			contGame = (scnr.next()).charAt(0);
		}

		System.out.println("Thanks for playing.");
	}
}
