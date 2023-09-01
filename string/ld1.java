
public class ld3 {
	 public static int lengthOfLastWord(String s) {
	        StringBuilder sb =new StringBuilder(" ");
	        for(int i=s.length()-1;i>0;i--){
	          if(s.charAt(i) == ' ') {
	        	  return sb.length()-1; }
	          sb.append(s.charAt(i));
	          }
  }
	        return -1;
	        }
	
	public static void main(String[] args) {
    String s = "luffy is still joyboy";
System.out.println(lengthOfLastWord(s));
	}

}
