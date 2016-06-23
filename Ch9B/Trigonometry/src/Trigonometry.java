
public class Trigonometry {
	public static void main (String[] args) {
		double input = 0.5246;
		double sine = Math.sin(Math.toRadians(input));
		double cos = Math.cos(Math.toRadians(input));
		double total = (sine * sine) + (cos * cos);
		
		System.out.println("Sine: " + sine + " Cosine: " + cos + " Sum: " + total);
	}
}
