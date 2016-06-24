import java.util.Scanner;
public class GroundBeefValueCalculator {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pricePoundA, pricePoundB, valueA, valueB;
		int leanA, leanB;
		char bestValue;
		
		System.out.print("Enter the price per pound of package A: ");
		pricePoundA = scan.nextDouble();
		System.out.print("Enter the percent lean of package A: ");
		leanA = scan.nextInt();
		System.out.print("Enter the price per pound of package B: ");
		pricePoundB = scan.nextDouble();
		System.out.print("Enter the percent lean of package B: ");
		leanB = scan.nextInt();
		
		valueA = (pricePoundA / leanA) * 100;
		valueB = (pricePoundB / leanB) * 100;
		
		if (valueA < valueB)
			bestValue = 'A';
		else
			bestValue = 'B';
		
		System.out.println("Package A cost per pound of lean: " + valueA);
		System.out.println("Package B cost per pound of lean: " + valueB);
		System.out.println("Package " + bestValue + " is the best value.");
		
		scan.close();
		
	}
}
