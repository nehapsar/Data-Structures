package Arraylist;
import java.util.*;
public class ar4 {
	
	public static int minimum(ArrayList<Integer> list) {
		int mx=Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<mx) {
				mx=list.get(i);
			}
		
		}
		return mx;
	}
