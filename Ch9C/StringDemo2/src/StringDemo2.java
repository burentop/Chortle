
public class StringDemo2 {
	public static void main (String[] main) {
		String str;
	    String trimStr;

	    str = new String( "   Elementary,     my dear Watson!!!   " );
	    trimStr = str.trim();

	    System.out.println(str);

	    System.out.println(trimStr);
	}
}
