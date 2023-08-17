package test;
import java.util.*;
public class testing {
	public static void main(String a[]) {
		int matrix[][]=new int[3][3];
		int m=matrix.length;
		int n=matrix.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input of the ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				//Scanner sc=new Scanner(System.in);
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				//Scanner sc=new Scanner(System.in);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

}
