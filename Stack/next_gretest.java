package example;
import java.util.*;
public class great {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[]= {6,8,0,1,3};

Stack<Integer> s=new Stack<>();
int nxtg[]=new int[num.length];
for(int i=num.length-1;i>=0;i--) {
	while(!s.isEmpty() && num[s.peek()]<=num[i]) {
		s.pop();		
	}
	if(s.isEmpty()) {
		nxtg[i]=-1;
	}
	else {
		nxtg[i]=num[s.peek()];
	}
	
	s.push(i);
}

for(int i=0;i<nxtg.length;i++) {
	System.out.print(nxtg[i]+" ");
	
}
	System.out.println();
	}

}
