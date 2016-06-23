import java.util.Scanner;
public class BrickDistance {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double seconds, distance;
		
		System.out.print("Enter the number of seconds: ");
		seconds = scan.nextDouble();
		
		distance = (0.5 * 32.174) * (seconds * seconds);
		
		System.out.println("Distance: " + distance);
		
		scan.close();
		
	}
}
