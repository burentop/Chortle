import java.util.Scanner;
public class Base2Log {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x, log;
		
		System.out.print("Enter a decimal number: ");
		x = scan.nextDouble();
		
		log = Math.log(x) / Math.log(2);
		
		System.out.println("Base 2 log of " + x + " is " + log);
		
		scan.close();
		
	}
}
