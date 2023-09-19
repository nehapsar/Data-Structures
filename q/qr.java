import java.util.*;
public class qr {
    public static void reverse(Queue <Integer> q1) {
    	Stack <Integer> s1=new Stack<>();
    	while(!q1.isEmpty()) {
			s1.push(q1.remove());
			
		}
    	while(!s1.isEmpty()) {
    		q1.add(s1.pop());
    	}
    }
