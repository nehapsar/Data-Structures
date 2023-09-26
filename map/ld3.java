package array;
import java.util.*;
public class ld3 {

    public static int removeElement(int[] num, int val) {
        HashMap <Integer,Integer> hs = new HashMap<>();
        int key=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                hs.put(num[i] , key);
                key++;
            }
        }
        return key;
    }

    public static void main(String args[]) {
    	//int num[]= {3,2,2,3};
    	int num[]= {0,1,2,2,3,0,4,2};
    	int val=2;
    	System.out.println(removeElement(num,val));
    }
}
