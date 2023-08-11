package example;
import java.util.*;
public class area {
	public static void  calculate(int num[]) {
int ls[]=new int[num.length];
int rs[]=new int[num.length];
Stack<Integer> s=new Stack<>();
int maxarea=0;
for(int i=0;i<=num.length-1;i++) {
	while(!s.empty() && num[s.peek()]>=num[i]) {
		s.pop();
	}
	if(s.isEmpty()) {
		ls[i]=num[num.length-1];
	}
	else {
		ls[i]=s.peek();
	}
	s.push(i);
	
}
      s = new Stack<>();
for(int i=num.length-1;i>=0;i--) {
	while(!s.empty() && num[s.peek()]>=num[i]) {
		s.pop();
	}
	if(s.isEmpty()) {
		rs[i]=-1;
	}
	else {
		rs[i]=s.peek();
	}
	s.push(i);
	
}
for(int i=0;i<num.length;i++) {
	int width=rs[i]-ls[i]-1;
	int current_area=num[i] * width;
  maxarea=Math.max(maxarea, current_area);
}
System.out.println(maxarea);
}
	public static void main(String[] args) {
		int num[]= {2,1,5,6,2,3};
calculate(num);
	}

}
