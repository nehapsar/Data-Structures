import java.util.*;
public class buy{
public static int buySell(int price[]){
int bp=Integer.MAX_VALUE;
int maxp=0;
for(int i=0;i<price.length;i++){
if(bp<price[i]){
int profit=price[i]-bp;
maxp=Math.max(maxp,profit);
}
else{bp=price[i];}
}
return maxp;}
//System.out.print(maxp);

public static void main(String args[]){
int price[]={7,1,5,3,6,4};
int h=buySell(price);
System.out.print(h);


}}
