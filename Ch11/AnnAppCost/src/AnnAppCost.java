import java.util.Scanner;
public class AnnAppCost {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double costPerHour, kwUsed, annCost;
		
		System.out.print("Enter the cost per kilowatt-hour in cents: ");
		costPerHour = scan.nextDouble();
		
		System.out.print("Enter the kilowatt-hours used per year: ");
		kwUsed = scan.nextDouble();
		
		annCost = costPerHour * kwUsed;
		
		System.out.println("Annual cost: $" + annCost);
		
		scan.close();
		
	}
}
