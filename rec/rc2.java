
public class rc2 {
	public static void printInc(int n) {
    	if(n==1) {
    		System.out.print(n+" ");
    		return;
    	}
    	
    	printInc(n-1);
    	System.out.print(n +" ");
    
    }

		int n=10;
		printInc(n);

	}

}
