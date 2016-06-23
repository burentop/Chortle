import java.util.Scanner;
public class CorrectChange {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cents, dollar, quarter, dime, nickel, penny;
		
		System.out.print("Enter the cents: ");
		
		cents = scan.nextInt();
		dollar = cents / 100;
		quarter = (cents % 100) / 25;
		
		System.out.println("Your change is: " + dollar + " dollar(s), " + quarter + " quarter(s)");
		
	}
}
