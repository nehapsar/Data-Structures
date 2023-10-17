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
public static int horspoolStringMatch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        if (patternLength > textLength) {
            return -1; // Pattern cannot be longer than the text
        }

        int[] shiftTable = generateShiftTable(pattern);

        int i = patternLength - 1;
        while (i < textLength) {
            int k = 0;
            while (k < patternLength && pattern.charAt(patternLength - 1 - k) == text.charAt(i - k)) {
                k++;
            }
