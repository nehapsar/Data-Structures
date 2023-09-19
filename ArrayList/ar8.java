package Arraylist;
import java.util.*;
public class ar8 {
public static boolean find(ArrayList <Integer> al , int target) {
	int lp=0;int rp=al.size()-1;
	while(lp<rp) {
		 if(target ==al.get(lp) + al.get(rp)) {
			 return true;
		 }
			if((al.get(lp) + al.get(rp))<target) {
				lp++;
			}
else {
				rp--;
			}
		 }
		
	
	return false;
}
	public static void main(String[] args) {
		ArrayList<Integer> al = new  ArrayList<>();
 al.add(1); al.add(2); al.add(3); al.add(4); al.add(5); al.add(6); al.add(7); al.add(8);
 System.out.print
 System.out.println(find(al ,5));
	}

}
