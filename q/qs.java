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