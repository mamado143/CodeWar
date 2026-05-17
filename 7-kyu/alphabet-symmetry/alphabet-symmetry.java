public class Solution {
​
    public static int[] solve(String[] arr) {
​
        int[] result = new int[arr.length];
​
        for (int i = 0; i < arr.length; i++) {
​
            String word = arr[i].toLowerCase();
            int count = 0;
​
            for (int j = 0; j < word.length(); j++) {
​
                char ch = word.charAt(j);
​
                int alphabetPos = ch - 'a' + 1;
​
                if (alphabetPos == j + 1) {
                    count++;
                }
            }
​
            result[i] = count;
        }
​
        return result;
    }
}