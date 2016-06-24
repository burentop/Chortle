import java.util.Scanner;
public class LastChanceGas {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tank, gauge, mpg, range;
		
		System.out.print("Please enter your gas tank capacity in gallons: ");
		tank = scan.nextInt();
		System.out.print("Please enter how full your tank is, in %: ");
		gauge = scan.nextInt();
		System.out.print("Please enter your car's miles per gallon: ");
		mpg = scan.nextInt();
		
		range = (int) ((tank * (gauge / 100.0)) * mpg);
		
		System.out.println("Tank capacity: " + tank);
		System.out.println("Gauge reading: " + gauge);
		System.out.println("Miles per gallon: " + mpg);
		System.out.println("Range: " + range);
		
		if (range >= 200) 
			System.out.println("Safe to proceed.");
		else
			System.out.println("Get gas!");
		
		scan.close();
		
	}
}
