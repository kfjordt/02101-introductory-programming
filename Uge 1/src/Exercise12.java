
public class Exercise12 {
	static String topTop 	= "   /\\   ";
	static String mellemTop = "  /  \\  ";
	static String bundTop 	= " /    \\ ";
	
	static String topMidt 	= "+------+";
	static String midtMidt 	= "I      I";
	
	static String topBund	= "I D T UI";
	static String bundBund 	= "ILyngbyI";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spikes();
		square();
		middle();
		square();
		spikes();
	}
	
	public static void spikes() {
		System.out.println(topTop 		+ " " + topTop 		+ " " + topTop );
		System.out.println(mellemTop 	+ " " + mellemTop 	+ " " + mellemTop);
		System.out.println(bundTop 		+ " " + bundTop 	+ " " + bundTop);
	}
	
	public static void square() {
		System.out.println(topMidt 	+ " " + topMidt 	+ " " + topMidt );
		System.out.println(midtMidt + " " + midtMidt 	+ " " + midtMidt );
		System.out.println(midtMidt + " " + midtMidt 	+ " " + midtMidt );
		System.out.println(topMidt 	+ " " + topMidt 	+ " " + topMidt );
	}
	
	public static void middle() {
		System.out.println(topBund 	+ " " + topBund 	+ " " + topBund );
		System.out.println(bundBund + " " + bundBund 	+ " " + bundBund );
	}
}
