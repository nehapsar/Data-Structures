         import java.util.*;
public class arr{
public static void update(int marks[]){
for(int i=0;i<marks.length;i++){
marks[i]=marks[i]+1;
}
}
public static void main(String args[]){
int marks[]=new int[3];
Scanner sc=new Scanner(System.in);
marks[0]=sc.nextInt();
marks[1]=sc.nextInt();
marks[2]=sc.nextInt();

//int marks[]={20,30,10};
update(marks);
for(int i=0;i<marks.length;i++){
System.out.print(marks[i]+" ");
}
System.out.println();
}}
