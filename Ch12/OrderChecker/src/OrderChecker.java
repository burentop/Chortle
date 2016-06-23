import java.util.Scanner;
public class OrderChecker {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int bolts, nuts, washers, totalPrice;
		final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
		
		System.out.print("Enter the number of bolts: ");
		bolts = scan.nextInt();
		System.out.print("Enter the number of nuts: ");
		nuts = scan.nextInt();
		System.out.print("Enter the number of washers: ");
		washers = scan.nextInt();
		
		totalPrice = (bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice);
		
		if (nuts >= bolts && washers >= (2 * bolts))
			System.out.println("Order is OK");
		else
			if (nuts < bolts)
				System.out.println("Check the order: too few nuts");
			if (washers < (2 * bolts))
				System.out.println("Check the order: too few washers");
		
		System.out.println();
		System.out.println("Total cost: " + totalPrice);
		
		scan.close();
		
	}
}
