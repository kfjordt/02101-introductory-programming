
public class Finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Finder.find(1,2,10));
		System.out.println(Finder.find(2,1,13));
		System.out.println(Finder.find(11,1,13));
		System.out.println(Finder.find(2,2,13));
		System.out.println(Finder.find(1,-1,6));
		System.out.println(Finder.find(1,1,6));
		System.out.println(Finder.find(0,0,0));
		System.out.println(Finder.find(112,133,67));
		System.out.println(Finder.find(11200,133,67));
		System.out.println(Finder.find(11201,133,67));
		System.out.println(Finder.find(11231,173,67));
		System.out.println(Finder.find(11231,0,13));
		System.out.println(Finder.find(0,112324,13)); 
	}
	public static String find(int k, int n, int b) {
		
		if (k < 0 || n < 0 || b <= 0) {
			return "Error";
		}
		
		int z = n;
		int i = 0;
		
		while ( z % b != 0 && z < Integer.MAX_VALUE) { 
			if (i != 0) {
				z = z + k + (i - 1);
			} 
			i++;
		}
		
		if (z < 0) {
			return "Overflow";
		} 
		return ""+z;
	}
}
