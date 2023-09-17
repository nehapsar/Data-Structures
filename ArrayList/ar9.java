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
