package array;
public class a1{
		 public static  int findMaxConsecutiveOnes (int[] nums ,int key) {
	        int prev=0;int count=0;
	        for(int i=0;i<nums.length;i++){
	        if(nums[i] == key){
	                count++;
	            }
      
