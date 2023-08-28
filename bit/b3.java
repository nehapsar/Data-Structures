package bit;

public class b3 {
     public static int set_ith_bit(int n,int i) {
    	 int Bitmask=1<<i;
    	 return n | Bitmask;
    	 	}

	 	}
	public static void main(String[] args) {
		int n=10;
		int i=2;
		System.out.println(set_ith_bit(n,i)                  );     
		
	}

}
