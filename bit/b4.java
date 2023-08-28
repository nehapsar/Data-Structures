
public class b4 {
   public static int clear_ithBit(int n ,int i) {
	   int Bitmask=1<<i;
	   return n ^ Bitmask;
   }
