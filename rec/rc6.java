package recursion;

public class rc6 {
public static int search(int num[] ,int key,int i) {
	if(i == num.length) {
		return -1;
	}
	if(num[i] == key) {
		 return i;
	}
	
