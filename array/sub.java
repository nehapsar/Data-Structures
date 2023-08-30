package array;

public class sub {
	public static int print_sub(int num[]) {
		int c=0;
		for(int i=0;i<=num.length-1;i++) {
			 for(int j=i;j<=num.length-1;j++) {
				 for(int k=i;k<=j;k++) {
					 System.out.print(num[k]);}
				 System.out.println();
				 c++; 
			 }
			System.out.println();
			
