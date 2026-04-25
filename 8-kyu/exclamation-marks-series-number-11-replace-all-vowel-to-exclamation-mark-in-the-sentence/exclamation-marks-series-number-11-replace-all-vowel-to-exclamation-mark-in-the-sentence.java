public class Solution {
    public static String replace(final String s) {
        String result = "";
​
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
​
            boolean vowel =
                    c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
​
            if (vowel) {
                result += "!";
            } else {
                result += c;
            }
        }
​
        return result;
    }
}