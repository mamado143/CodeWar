public class Palindrome {
  public static Boolean isPalindrome(String x) {
    // your code here
            x = x.toLowerCase();
​
    for(int i = 0; i < x.length(); i++){
      if(x.charAt(i) != x.charAt(x.length() - 1 - i)){
        return false;
      }
    }
    return true;
  }
}