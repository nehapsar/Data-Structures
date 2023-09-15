package array;
import java.util.*;
public class q {
	public static void alternate(Queue q1) {
         Queue <Integer> firsthalf = new LinkedList<>();
         int size=q1.size()/2;
         for(int i=1;i<=size;i++) {
              	 
            		 firsthalf.add(q1.remove());
         }
         while(! firsthalf.isEmpty()) {
        	 q1.add( firsthalf.remove());
        	 q1.add(q1.remove());
         }
                  
         
	}  
	public static void main(String[] args) {
	   Queue <Integer> q1 = new LinkedList<>();
	   
	   q1.add(1); q1.add(2); q1.add(3); q1.add(4); q1.add(5); q1.add(6); q1.add(7);
	   q1.add(8); q1.add(9); q1.add(10);
	   alternate(q1);
	}
}
