import java.util.*;
public class eo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter your number: ");
int n=sc.nextInt();
int odsum=0;
int evsum=0;
while(true){
if(n%2==0){
evsum+=n;
}
else{
odsum+=n;}
System.out.println("please enter your choice: ");
int ch=sc.nextInt();
if(ch==1){
System.out.println("odd sum is" +odsum);}
if(ch==2){
System.out.println("even sum is" +evsum);}
}
}}
