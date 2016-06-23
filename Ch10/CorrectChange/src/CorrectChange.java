import java.util.Scanner;
public class CorrectChange {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cents, dollar, quarter, dime, nickel, penny;
		
		System.out.print("Enter the cents: ");
		
		cents = scan.nextInt();
		dollar = cents / 100;
		quarter = (cents % 100) / 25;
		dime = (cents % 25) / 10;
		nickel = (((cents % 100) % 25) % 10) / 5; 
		penny = (cents % 5);
		
		System.out.println("Your change is: " + dollar + " dollar(s), " + quarter + " quarter(s) " + dime + " dime(s) " +
				nickel + " nickel(s) " + penny + " pennies.");
		
		scan.close();
		
	}
}
