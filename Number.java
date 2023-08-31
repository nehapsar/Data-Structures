package bit;

public class Number {
 public static int Count(int n) {
	 int k=0;
	 while(n >0) {
		 if((n & 1) !=0) {
			k++;

		 }
			n=n>>1;
	 }
	 return k;
 }
	public static void main(String[] args) {
	int n=15;
		System.out.println(Count(n));

	}

}
