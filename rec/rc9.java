package recursion;

public class rc8 {
        public static void pairs(int n ,int lastPos, String str) {
        	if(n==0) {
        		System.out.println(str);
        		return;
        	}
        	
        	
        	pairs(n-1,0,str+"0");
        	
if(lastPos==0) {
        		pairs(n-1,1,str+"1");
        	}
        }
public static void main(String[] args) {
		int n=10;
		
		pairs(n ,0,""); 

	}

}
