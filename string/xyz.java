public class xyz {
	
	    public static  int lengthOfLastWord(String s) {
	        StringBuilder sb =new StringBuilder(" ");
	        s =s.trim();
	        for(int i=s.length()-1;i>=0;i--){
	           if(s.charAt(i)==' '){
	             return sb.length()-1;
	           }
	           else {
	           sb.append(s.charAt(i));
	           
	        

	           }
	          }
	            return -1;
	    }  

