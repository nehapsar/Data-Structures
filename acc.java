package two_d;
import java.util.*;
public class test1 {
	public static String convert(String str) {
		 Queue<Character> q=new LinkedList<>();StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
	      q.add(str.charAt(i));
}int i=0;
		while(!q.isEmpty()) {
			if(str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
				char front=Character.toLowerCase(q.remove());
				i++;System.out.println();
				System.out.print(front);
			}
			else {
				char front=Character.toUpperCase(q.remove());
				i++;
				System.out.print(front);
			}
		}
		return sb.toString();	
	}
