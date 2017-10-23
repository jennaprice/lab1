import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		char continueGame = 'y';

		System.out.println("Welcome to Grand Circus Room Detail Generator!");
		// checks to continue the cycle
		while (continueGame == 'y') {
			System.out.println("Please Enter Length:");
			double length = scnr.nextDouble();
			System.out.println("Please Enter Width:");
			double width = scnr.nextDouble();
			System.out.println("Please Enter Height:");
			double height = scnr.nextDouble();

			// I made functions for code reusability
			System.out.println("Area: " + calculateArea(width, length));
			System.out.println("Perimeter: " + calculatePerimeter(width, length));
			System.out.println("Volume:" + calculateVolume(width, length, height));

			System.out.println("Would you like to continue: (y/n)");
			// for some reason nextChar() is not a command
			continueGame = (scnr.next()).charAt(0);

		}
		System.out.println("Exiting now.");

	}

	public static double calculateArea(double width, double length) {
		double area = width * length;

		return area;
	}

	public static double calculatePerimeter(double width, double length) {
		double perimeter = (2 * width) + (2 * length);

		return perimeter;
	}

	public static double calculateVolume(double width, double length, double height) {
		double volume = width * length * height;

		return volume;
	}
}
