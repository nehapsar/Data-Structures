package treeeeee;

public class st1 {
public static boolean check(String st) {
	for(int i=0;i<st.length();i++) {
		if(st.charAt(i)==st.charAt(st.length()-i-1)) {
			return true;
		}
	}
	return false;
}
	public static void main(String[] args) {
		String st="noon";
       System.out.println(check(st));
	}

}
