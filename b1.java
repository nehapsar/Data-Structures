package bit;

public class b2 {
public static int ith_bit(int n,int i) {
	int Bitmask=1;
	if((  n & Bitmask<<i) == 0) {
		return 0;
	}
	return 1;
}
//	public static void main(String[] args) {
		int n=8;
		int i=2;
//		System.out.println(ith_bit(n,i));

	}

}
