package bit;

public class b6 {
       public static int clear_set(int n, int i,int j) {
    	   int bitmask1 =  ((~0) << (j+1));
    	   int bitmask2 = (1 << i) - 1;
    	   
    	   return  n & ( bitmask2 | bitmask1 );
    	   
       }

public static void main(String[] args) {
		int n=10,i=2,j=4;
		System.out.println(clear_set(n ,i,j));
		
	}

}
