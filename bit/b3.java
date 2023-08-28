package bit;

public class b3 {
     public static int set_ith_bit(int n,int i) {
    	 int Bitmask=1<<i;
    	 return n | Bitmask;
    	 	}
