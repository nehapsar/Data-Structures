public class bit{
public static void even_odd(int n){
int bitMask=1;
if((n & bitMask) == 0){
System.out.println("the number is even");
}
else{
System.out.println("the number is odd");}}

public static void main(String args[]){
int n=4;
even_odd(4);}}
