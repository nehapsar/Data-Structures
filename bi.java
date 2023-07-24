public class bi{
public static int search(int num[],int key){
for(int i=0;i<num.length;i++){
if(num[i]==key){
System.out.println("the key found at position"+" "+i);
return i;}
}
System.out.println("the key not found");

return -1;}

public static void main(String args[]){
int num[]={1,2,3,4,5,6,7,8};
int key=5;
//System.out.println(search(num,key));
search(num ,key);
}}
