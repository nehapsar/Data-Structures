public class HorspoolStringMatch {
    public static void main(String[] args) {
        String text = "ABAAABCDBBABCDDEBCABC";
        String pattern = "ABC";

        int index = horspoolStringMatch(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found in the text");
        }
    }
