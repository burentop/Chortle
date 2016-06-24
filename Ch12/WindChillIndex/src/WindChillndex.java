import java.util.Scanner;
import java.math.*;
public class WindChillndex {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);

		float wci, temp, wind;
		double fraction = (double) 1/2;
		
		System.out.print("Please enter the temperature in Fahrenheit: ");
		temp = scan.nextFloat();
		System.out.print("Please enter the wind speed: ");
		wind = scan.nextFloat();
		
		if (0 <= wind && wind <= 4)
			wci = temp;
		else if (wind >= 45)
			wci = (1.6F * temp) - 55;
		else
			wci = 91.4F + ((91.4F - temp) * ((0.0203F * wind) - (0.304F * (float)(Math.pow(wind,  fraction))) - 0.474F));
		
		System.out.println("The wind chill is: " + wci);
		
		scan.close();
		
	}
	
}
