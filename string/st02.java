package string;

public class st8 {
	public static boolean check(String st1,String st2) {
		if(st1.length()!=st2.length()) {
			return false;
		}
		else {
			for(int i=0;i<st1.length()-1;i++){
				for(int j=0;j<st2.length()-1;j++) {
					if(st1.charAt(i)==st2.charAt(j)) {
						return true;					
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String st1="care";
		String st2="race";
		System.out.println(check(st1,st2));
		
	}

}
