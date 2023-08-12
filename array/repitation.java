package array;
import java.util.*;
public class count {
	
       public static boolean find(int num[]) {
    	   Stack <Integer> s= new Stack<>();
    	   for(int i=0;i<=num.length-1;i++) {
    	        for(int j=i+1;j<=num.length-1;j++) {
    	        	if(num[i]==num[j]) {
    	        		return false;}
    	        }
    	   
    	   
    	   
    	   
    	   
    	   }
    		   return true;
       }
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
System.out.println(find(num));
	}

}
