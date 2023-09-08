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
