package recursion;

public class rc9 {
public static int pairFreinds(int n) {
	if(n==1 || n==2) {
		return n;
	}
	return (pairFreinds(n-1) + (pairFreinds(n-2)*(n-1)));
}
	public static void main(String[] args) {
		System.out.println(pairFreinds(3));
}

}
