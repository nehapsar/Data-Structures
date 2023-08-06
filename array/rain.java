package array;

public class rain {
public static int calcualte_water(int height[]) {
	//to calculate lef maximum of height
	int leftmax[]=new int[height.length];
	leftmax[0]=height[0];
	for (int i=1;i<height.length;i++) {
		leftmax[i]=Math.max(height[i],leftmax[i-1]);
	}
	//to calcualte right max boundary
	int rightmax[]=new int [height.length];
	rightmax[height.length-1]=height[height.length-1];
	for(int i=height.length-2;i>=0;i--) {
		rightmax[i]=Math.max(rightmax[i+1],height[i]);
	}
		int trapped_water=0;
		for(int i=0;i<height.length;i++) {
			int water_level=Math.min(rightmax[i], leftmax[i]);
			trapped_water+=water_level-height[i];
			
		}
		
	return trapped_water;
}
		
	public static void main(String[] args) {
		// height of the bars
		int height[]= {4,2,0,6,3,2,5,55,0,6,99};
System.out.println("the water collected is"+" "+calcualte_water(height));
	}

}
