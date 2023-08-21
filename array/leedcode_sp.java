package array;

public class Solutions {
	
	    public static void spiralOrder(int[][] matrix) {
//	        int sr=0,sc=0;
 //	        int er=matrix.length-1;
//	        int ec = matrix[0].length-1;

//	        while(sr<=er && sc<=ec){
	            //top
	        for(int i=sc;i<=ec;i++){
	            System.out.print(matrix[sr][i]+" ");
	        }
	        //lwft
	        for(int j=sr+1;j<=er;j++){
	        	/*if(sc==ec) {
	        		break;
	        	}*/
	            System.out.print(matrix[j][ec]+" ");
	        }
	        //bottom
	        for(int i=ec-1;i>=sc;i--){
	        	
	            System.out.print(matrix[er][i]+" ");
	        }

	        for(int j=er-1;j>=sr+1;j--){
	        	if(sc==ec) {
	        		break;
	        	}
	            System.out.print(matrix[j][sc]+" ");
	        }

	         sr++;
	         sc++;
	         er--;
	         ec--;
	       }
//	       return -1;
	    }
	    public static void main(String args[]){
	        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
	      spiralOrder(matrix);
	    }
	}

