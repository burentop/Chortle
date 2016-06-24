import java.util.Scanner;
public class PieEatingContest {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int weight, wtDiff;
		
		System.out.print("Please enter your weight in pounds: ");
		weight = scan.nextInt();
		
		wtDiff = Math.abs(250 - weight);
		
		if (wtDiff <= 30)
			System.out.println("Congratulations! You have been entered in the contest!");
		else
			if (weight > 250)
				System.out.println("I'm sorry, you weigh too much for the contest.");
			else
				System.out.println("I'm sorry, you don't weigh enough for the contest.");
		
		scan.close();
	}
}
