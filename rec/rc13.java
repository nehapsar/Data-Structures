package recursion;

public class rc13 {
     public static void len(String str,int idx) {
    	 if(idx==str.length()) {
    		 System.out.println(idx);
    		 return;
    	 }
    	 
    	 len(str,idx+1);
    	 
     }
	 
     }
	public static void main(String[] args) {
		String str="neha";
		len(str, 1);

	}

}
