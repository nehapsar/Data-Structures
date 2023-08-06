package example;
import java.util.*;
public class stack3 {
    public static String reverse(String str) {
    	Stack<Character> s=new Stack<>();
    	int idx=0;
    	while(idx<str.length()) {
    		s.push(str.charAt(idx));
    		idx++;
    	}
    	StringBuilder sb=new StringBuilder(" ");
    	while(!s.isEmpty()) {
    		char ch=s.pop();
    		sb=sb.append(ch);
    		
    	}
    	return sb.toString();
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="abcdefghijklmnop";
     String result=reverse(str);
     System.out.println(result);
	}

}
