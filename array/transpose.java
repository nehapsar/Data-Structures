package two_d;

public class td11 {
	public static void transpose(int matrix[][]) {
	 
         //to print the transpose of the matrix

		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
			System.out.print(matrix[i][j]+" ");
			}	
			System.out.println();
		}
	}
	
public static void main(String args[]) {
	int matrix[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	/*
	1  2   3
	4  5   6
	7  8   9
	10 11  12
	*/

             //to print the matrix of m*n must past the column and row
	     int row=4,column=3;
	     int matrixT[][]=new int[column][row];
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
				matrixT[j][i]=matrix[i][j];
				}	
						}
			transpose(matrixT);
}
}

