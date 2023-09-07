package array;
public class a1{
		 public static  int findMaxConsecutiveOnes (int[] nums ,int key) {
	        int prev=0;int count=0;
	        for(int i=0;i<nums.length;i++){
	        if(nums[i] == key){
	                count++;
	            }
      

	            else {
	            	prev=count;
	                count=0;
	                }
	 }
	        return Math.max(prev, count);
	    }

public static void main(String[] args) {
		int nums[]= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums,1));
}
}
