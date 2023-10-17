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

            if (k == patternLength) {
                return i - patternLength + 1; // Pattern found
            } else {
                i += shiftTable[text.charAt(i) - 'A'];
            }
        }

        return -1; // Pattern not found
    }
private static int[] generateShiftTable(String pattern) {
        int patternLength = pattern.length();
        int[] shiftTable = new int[256]; // ASCII character set assumed

        for (int i = 0; i < shiftTable.length; i++) {
            shiftTable[i] = patternLength;
        }

        for (int i = 0; i < patternLength - 1; i++) {
            char c = pattern.charAt(i);
            shiftTable[c - 'A'] = patternLength - 1 - i;
        }

        return shiftTable;
    }
}
