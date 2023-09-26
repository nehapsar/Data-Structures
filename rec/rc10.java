package recursion;
public class rc10 {
public static int tilling(int n) {
if (n==0 || n==1) { 
   return 1;
}


return tilling(n-1)+tilling(n-2)  ;
	}
	public static void main(String args[]) {
		int n=5;
	
      System.out.println(tilling(5));
      
	}
}
