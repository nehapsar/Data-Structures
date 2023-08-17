package string;

import java.util.Arrays;

public class st9 {
	public static boolean check(String st1,String st2) {
		
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		if(st1.length()==st2.length()) {
			char ch1[]=st1.toCharArray();
			char ch2[]=st2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			Arrays.equals(ch1, ch2);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String st1="care";
		String st2="racejhghd";
		System.out.println(check(st1,st2));
		
	}

}
