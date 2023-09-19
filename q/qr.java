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
public static void main(String[] args) {
		Queue <Integer> q1 = new LinkedList<>();
		
		q1.add(1);q1.add(2);q1.add(3);q1.add(4);q1.add(5);
		reverse(q1);
		while(!q1.isEmpty()) {
			System.out.println(q1.remove()+" ");
		}
	}

}
