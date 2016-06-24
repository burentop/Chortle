import java.util.Scanner;
public class Y2KProblem {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inputBirth, inputCurrent, fullBirth, fullCurrent, age;
		
		System.out.print("Please enter the last 2 digits of your birth year: ");
		inputBirth = scan.nextInt();
		System.out.print("Please enter the last 2 digits of the current year: ");
		inputCurrent = scan.nextInt();
		
		if (inputBirth > 16 || (inputCurrent - inputBirth < 0))
			fullBirth = 1900 + inputBirth;
		else
			fullBirth = 2000 + inputBirth;
		
		if ((inputCurrent - inputBirth > 0))
			fullCurrent = 1900 + inputCurrent;
		else
			fullCurrent = 2000 + inputCurrent;
		
		age = fullCurrent - fullBirth;
		
		if (age < 0)
			fullCurrent = 2000 + inputCurrent;
			age = fullCurrent - fullBirth;
		
		System.out.println("Year of birth: " + fullBirth);
		System.out.println("Current year: " + fullCurrent);
		System.out.println("Your age: " + age);
		
		scan.close();
	}
}
