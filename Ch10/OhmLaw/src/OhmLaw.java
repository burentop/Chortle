import java.util.Scanner;
public class OhmLaw {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int volt, resist;
		double current;
		
		System.out.print("Please enter the voltage: ");
		volt = scan.nextInt();
		
		System.out.print("Please enter the resistance (in ohms): ");
		resist = scan.nextInt();
		
		current = (volt + 0.0) / resist;
		
		System.out.println("The current is: " + current);
		
		scan.close();
		
	}
}
