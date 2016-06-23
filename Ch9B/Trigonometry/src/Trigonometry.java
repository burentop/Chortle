
public class Trigonometry {
	public static void main (String[] args) {
		double angle = 30;
		double sine = Math.sin(angle * Math.PI/180);
		double cos = Math.cos(angle * Math.PI/180);
		double total = (sine * sine) + (cos * cos);
		
		System.out.println("Sine: " + sine + " Cosine: " + cos + " Sum: " + total);
	}
}
