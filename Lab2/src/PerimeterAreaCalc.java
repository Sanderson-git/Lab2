import java.util.Scanner;

public class PerimeterAreaCalc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		System.out.println("Enter Length:");
		int roomLength = scnr.nextInt();
		
		System.out.println("Enter Width:");
		int roomWidth = scnr.nextInt();
		
		System.out.println("Area: " + roomLength * roomWidth);
		System.out.println("Perimeter: " + (roomLength * 2 + roomWidth * 2));
		
		System.out.println("Continue? (y/n)");
		char toContinue = scnr.next().charAt(0);
			if (toContinue == ('y')) {
				main(null); // if input is Y then call main again.
			} else {
				System.out.println("Ending.");
			}
	}
}
