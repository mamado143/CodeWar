public class Solution {
  public static int century(int number) {
    // your code goes here
     int century = (number - 1) / 100 + 1;
    return century;
    }
}