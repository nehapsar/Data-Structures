package array;

public class bin {
      public static int binary(int num[], int key) {
    	  int si=0;
    	  int ei=num.length;
    	  
  	  while(si<=ei) {
    		int mid=(si+ei)/2;
    		if(num[mid]==key) {
    			return mid;
    		}
    //		else if(num[mid]>key) {
    			ei=mid-1;
    		}
    //		else {
    			si=mid+1;
    		}
    	  }
    	  return -1;
      }
//	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		int key=9;
		System.out.println(binary(num,key));

	}

}
