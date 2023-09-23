
public class ld5 {
	
	
	    public  static void mergeAlternately(String word1, String word2,StringBuilder sb) {
	        int x=word1.length()+word2.length();
	        
	       
	        for(int i=0;i<=x;i++){
	         if(i%2 == 0){
	           sb.append(word1.charAt(i));

	         }
	         if(i%2 != 0){
	           sb.append(word2.charAt(i));
	         }

	        }
	        
	    }
	

	public static void main(String[] args) {
		String word1 = "abc";  String word2 = "pqr";
		 StringBuilder sb =new StringBuilder(" ");
		mergeAlternately(word1 ,word2,sb);
		System.out.println(sb.toString());
	}

}
