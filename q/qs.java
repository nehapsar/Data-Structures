package q;
import java.util.*;
public class qs {
	static class queue{
		static Stack<Integer> s1=new Stack<>();
		static Stack<Integer> s2=new Stack<>();
		//to check the stack is empty
		public static boolean isEmpty() {
			return s1.isEmpty();
		}
		// to add
public static void add(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
// to remove
		public static int remove() {
			if(s1.isEmpty()) {
				System.out.println("the queue is empty");
				return -1;
			}
			return s1.pop();
		}
public static int peek() {
			if(s1.isEmpty()) {
				System.out.println("the queue is empty");
				return -1;
			}
			return s1.peek();
		}

	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q1 = new queue();
		q1.add(1);
		q1.add(2);
        q1.add(3);
