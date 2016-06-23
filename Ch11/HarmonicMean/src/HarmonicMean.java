import java.util.Scanner;
public class HarmonicMean {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x, y, avg, hMean;
		
		System.out.print("Enter a decimal number: ");
		x = scan.nextDouble();
		System.out.print("Enter another decimal number: ");
		y = scan.nextDouble();
		
		avg = (x + y) / 2;
		hMean = 2 / (1 / x + 1 / y);
		
		System.out.println("Arithmetic mean: " + avg);
		System.out.println("Harmonic mean: " + hMean);
		
		scan.close();
		
	}
}
