package string;

public class st3 {
public static String check(String str[]) {
	String s="";
	for(int i=0;i<str.length;i++) {
		if((s.compareToIgnoreCase(str[i]))<0){
			s=str[i];
		}
	}
	return s;
}
	public static void main(String[] args) {
		String str[]= {"apple","banana","mango","pineapple"};
        System.out.println(check(str));
	}

}
