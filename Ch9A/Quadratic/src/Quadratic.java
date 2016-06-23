
public class Quadratic {
	public static void main(String[] args) {
		double x = 3.14, y = 4.2;
		double result;
		
		result = (3 * (x * x)) - (8 * y) +4;
		
		System.out.println("At X = " + x + " and Y = " + y + "the value is " + result);
		
		y = 0;
		result = (3 * (x * x)) - (8 * y) +4;
		
		System.out.println("At X = " + x + " and Y = " + y + "the value is " + result);
	}
}
