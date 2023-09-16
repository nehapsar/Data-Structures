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

			public static void main(String[] args) {
				ArrayList<Integer> list =new ArrayList<>();
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.add(5);
				list.add(6);
	System.out.println(minimum(list));
		}

	}
