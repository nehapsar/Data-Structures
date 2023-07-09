public class buble{
public static void buble_sort(int num[]){
for(int i=0;i<num.length-1;i++){
for(int j=0;j<num.length-1-i;j++){
if(num[j]<num[j+1]){
int temp=num[j];
num[j]=num[j+1];
num[j+1]=temp;
}
}
}
for(int i=0;i<num.length;i++){
System.out.print(num[i]);}
System.out.println();
}

public static void main(String args[]){
int num[]={4,5,2,3,1};
buble_sort(num);
}}
