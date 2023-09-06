package recursion;

public class rc5 {
	public static boolean isSorted(int num[],int i) {
		
		if(i==num.length-1) {
			return true;
		
	}
		if(num[i+1] <num[i]) {
			return false;
		}

		return isSorted(num,i+1);
	}

	public static void main(String[] args) {
      int num[]= {1,2,3,4,5,9,6};
      System.out.println(isSorted(num,0));
	}

}
