import java.util.Scanner;
public class DiscountPrice {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int originalPrice, discountPrice;
		
		System.out.print("Enter the amount of the purchase (in cents): ");
		originalPrice = scan.nextInt();
		
		if (originalPrice > 1000)
			discountPrice = (int) (originalPrice * 0.9);
		else
			discountPrice = originalPrice;
		
		System.out.println("Discounted price: " + discountPrice);
		
		scan.close();
		
	}
}
