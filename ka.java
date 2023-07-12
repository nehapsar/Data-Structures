       import java.util.*;
public class ka{
public static void kadans(int num[]){
int cs=0;
int ms=Integer.MIN_VALUE;
for(int i=0;i<num.length;i++){
cs+=num[i];
if(cs<0){
cs=0;}
ms=Math.max(cs,ms);}
System.out.print("maximum sum ="+ms);
}
public static void main(String args[]){
int num[]={-2,-3,4,-1,-2,1,5,-3};
kadans(num);
}}



