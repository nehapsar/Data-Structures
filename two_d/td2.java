package test;

public class td2 {
	public static void print(int mat[][]) {
		int sr=0;
		int er=mat.length-1;
//		int sc=0;
//		int ec=mat[0].length-1;
		while(sr<=er && sc<=ec) {
			//top
			for(int i=sc;i<=ec;i++) {
				System.out.print(mat[sr][i]+" ");
			}
			//right
			for(int j=sr+1;j<=er;j++) {
				if(sc==ec) {
					break;
				}
				System.out.print(mat[j][ec]+" ");
			}
			//bottom
			for(int i=ec-1;i>=sc;i--) {
				System.out.print(mat[er][i]+" ");
			}
			//left
			for(int j=er-1;j>=sr+1;j--) {
				if(sr==er) {
					break;
				}
				System.out.print(mat[j][sc] +" ");			}
			sc++;
			
			sr++;
			ec--;
			er--;
			
		}
	}

	public static void main(String[] args) {
		int mat[][]= {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}
				       };
print(mat);
	}

}
