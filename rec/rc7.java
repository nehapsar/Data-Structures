package recursion;
import java.util.*;
public class rc7 {
       public static int secSearch(int num[],int key ) {
    	  HashMap <Integer,Integer> hm = new HashMap<>(); 
    	  for(int j=0;j<num.length;j++) {
    		  hm.put(num[j], j);
    	  }
    	  
    	  return hm.get(key);
    	  
       }
public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,9,7,8,9};
		int key=3;
		System.out.println(secSearch(num,key));
	}

}
