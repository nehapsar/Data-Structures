import java.util.*;
public class min{
public static int get_minimum(int num[]){
int  min=Integer.MAX_VALUE;
for(int i=0;i<num.length;i++){
if(min>num[i]){
min=num[i];
}}
return min;
}




public static void main(String args[]){
int num[]={1,2,33,4,5,6,7,9};
int min=get_minimum(num);
System.out.print("the minimum number is"+" "+min);




}}
