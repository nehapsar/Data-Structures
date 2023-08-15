package string;

public class st4 {

	

	
		public static String convert(String str) {
			StringBuilder sb=new StringBuilder (" ");
			sb.append(Character.toLowerCase(str.charAt(0)));
					for(int i=1;i<str.length();i++) {
			   if(str.charAt(i) == ' ' && i<str.length()) {
				   sb.append(str.charAt(i));
				   i++;
				   sb.append(Character.toLowerCase(str.charAt(i)));
				   
				   
				   
			   }
			   else {
				   sb.append(str.charAt(i));
			   }
			}
			return sb.toString();
		}

		public static void main(String[] args) {
			String str="HI SWEET HEART HOE ARE YOU";
			System.out.println(convert(str));
		}

	}

