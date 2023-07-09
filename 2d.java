import java.util.*;
public class 2d{
public static void main(String args[]){
int matrix[][]=new int[3][3];
int n=matrix.length, m=matrix[0].length;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
Scanner sc=new  Scanner(System.in);
 matrix[i][j]=sc.nextInt();
}}
//for print
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
System.out.print(matrix[i][j]);}}
}
}
