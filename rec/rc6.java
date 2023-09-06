package recursion;

public class rc6 {
public static int search(int num[] ,int key,int i) {
	if(i == num.length) {
		return -1;
	}
	if(num[i] == key) {
		 return i;
	}
	

	return search(num , key,i+1);
}
	
	public static void main(String[] args) {
int num[]= {1,2,3,4,4,5,6,7,8};int key=4;
System.out.println(search(num,key,0));
	}

}
