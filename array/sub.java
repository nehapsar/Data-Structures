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
			
	
		}
		return c
;	}

	public static void main(String[] args) {
    int num[]= {1,2,3,4,5};
     print_sub(num);
System.out.println( "the total sub arrays are "+print_sub(num));
	}

}
