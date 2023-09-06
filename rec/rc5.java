package recursion;

public class rc5 {
	public static boolean isSorted(int num[],int i) {
		
		if(i==num.length-1) {
			return true;
		
	}
		if(num[i+1] <num[i]) {
			return false;
		}
