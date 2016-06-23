import java.util.Scanner;
public class CircleArea {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the radius: ");
		int inputRad = scan.nextInt();
		double area = Math.PI * (inputRad * inputRad);
		System.out.println("Radius is: " + inputRad + " ; Area is: " + area);
	}
}
