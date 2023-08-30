package bit;

public class b7 {
    public static boolean isTwoPower(int n) {
    	return (n & (n-1)) == 0;
    }
		
	public static void main(String args[]) {
	 //int n=8;
		System.out.println(isTwoPower(9));
	}
}
