public class shas{
public static  void pr(int num[]){

//to count

for(int i=0;i<num.length;i++){
int count=1;
for(int j=i+1;j<num.length;j++){

if(num[i]==num[j]){
     count++;
}
// to print an array
if(count==1){
System.out.print(num[i]);
break;
}
else if(count%2!=0){
System.out.print(num[i]);
break;
}
}
}
}
public static void main(String args[]){
int num[]={1,2,2,3,3,3,4,4,5};
pr(num);
int count=0;

// input is{1,2,2,3,3,3,4,4,5}
//output------->1,3,5
}}
