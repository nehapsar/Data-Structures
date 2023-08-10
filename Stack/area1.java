package example;
import java.util.*;
public class area {
	public static void  calculate(int num[]) {
int ls[]=new int[num.length];
int rs[]=new int[num.length];
Stack<Integer> s=new Stack<>();
for(int i=0;i<=num.length-1;i++) {
	while(!s.empty() && num[s.peek()]>=num[i]) {
		s.pop();
	}
	if(s.isEmpty()) {
		ls[i]=num[num.length-1];
	}
	else {
		ls[i]=num[s.peek()];
	}
	s.push(i);
	
}
Stack s;
for(int i=num.length-1;i<=0;i--) {
	while(!s.empty() && num[s.peek()]>=num[i]) {
		s.pop();
	}
	if(s.isEmpty()) {
		rs[i]=num[num.length-1];
	}
	else {
		rs[i]=num[s.peek()];
	}
	s.push(i);
	
}
}
	public static void main(String[] args) {
		int num[]= {2,1,5,6,2,3};

	}

}
