package hashmap;
import java.util.*;
public class repe {
public static boolean check(int num[]) {
	HashSet <Integer> hs = new HashSet<>();
	for(int i=0;i<num.length;i++) {
	hs.add(num[i]);
	}
	if(hs.size()==num.length) {
	return true;	
	}
	return false;
}
public static void main(String[] args) {
		int num[]= {1,2,4,4,3};
       System.out.println( check(num));
	}

}
