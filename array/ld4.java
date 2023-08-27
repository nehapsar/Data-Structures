package array;

public class ld4 {

	
	    public static int searchInsert(int[] nums, int target) {
	        int n=nums.length -1;
	    for(int i=0;i<n;i++){
	        if(nums[i]==target){
	            return i;
	        }
	        else if(nums[i]<target && nums[i+1]>target  && i<n){
	           return i+1;
	        }
	    }       
	    return n+1; 
	     
	    
	}
	    public static void main(String args[]) {
	    	int nums[]= {1,3,5,6};
	    	int target = 7;
	    	System.out.println(searchInsert(nums,target));
	    }
}

