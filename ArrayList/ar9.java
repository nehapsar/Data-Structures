package Arraylist;
import java.util.*;
public class ar9 {
public static boolean find(ArrayList<Integer> al ,int target) {
	int n = al.size();
	int bp=-1;
	for(int i=0;i<n;i++) {
		if(al.get(i)>al.get(i+1)) {
			bp=i;
			break;
		}
	}
int lp=bp+1;
	int rp=bp;
	while(lp!=rp) {
		if(al.get(lp)+al.get(rp)== target) {
			return true;
		}
		if((al.get(lp)+al.get(rp))<target) {
			lp=(lp+1) % n ;
		}
		else {
			rp = (rp+n-1)%n;
		}
	}
	return false;		
}
}
	public static void main(String[] args) {
	ArrayList<Integer> al =new ArrayList<>();
	al.add(11);al.add(15);al.add(6);
	al.add(8);al.add(9);al.add(10);
	System.out.print(find(al,36));
	}

}
