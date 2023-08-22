package hashmap;
import java.util.*;

public class hm4 {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (hm.containsKey(ch)) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        
        return hm.isEmpty(); // Moved the return statement outside of the loop
    }

    //public static void main(String args[]) {
        String s = "care";
        String k = "race";
  //      boolean result = isAnagram(s, k);
//        System.out.println("Are the strings anagrams? " + result);
    }
}
