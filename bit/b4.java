
public class b4 {
   public static int clear_ithBit(int n ,int i) {
	   int Bitmask=1<<i;
	   return n ^ Bitmask;
   }

	public static void main(String[] args) {
		int n=10;
		int i=1;
		System.out.println(clear_ithBit(n,i));

	}

}
