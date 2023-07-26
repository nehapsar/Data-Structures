public class binary_srch{
public static int  search(int num[],int key){
     int si=0;
     int ei=num.length-1;
  while(si<=ei){
      int mid=(si+ei)/2;
      if(num[mid]==key){
      return mid;      }
      if(num[mid]>key){
             ei=mid-1;}
      else{
        si=mid+1;}
       }
return -1;

}


public static void main(String args[]){
int num[]={1,2,3,4,5,6,7,8,9};
int key=8;
System.out.println("the key found at"+search(num,key));

}
}
