package array;

public class stock {
	public static int profit(int day[]) {
		int profit=0;
		int buy=Integer.MAX_VALUE;
		
		for(int i=0;i<day.length;i++) {
		   if(buy<day[i]) {
			  int pr=day[i]-buy;
			 profit= Math.max(profit,pr);
		   }
		
		   else {
			   buy=day[i];
		   }
		
		}
	
	return profit;
	}
	
	
	public static void main(String args[]) {
		int day[]= {7,1,5,3,6,4};
		System.out.println(profit(day));
	}

}
