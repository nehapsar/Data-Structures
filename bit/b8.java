public class b8 {
       public static int PowerOfNumber(int a , int n) {
    	    
    	   int ans=1;
    	   
    	   while(n > 0) {
    		   if((n & 1) != 0) {
    			   ans = ans * a;
    			   }
    		   a = a * a ;
    		     n =n>>1;
    	   }
    	   return ans;
       }
  
	public static void main(String[] args) {
		int a=5; int n=2; 
     System.out.println(PowerOfNumber(a,n));
	}

}
