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
