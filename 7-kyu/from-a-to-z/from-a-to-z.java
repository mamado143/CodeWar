public class Solution{
  public static String gimmeTheLetters(String s){
    //put your lovely code here ^_^
   char start = s.charAt(0);
    char end = s.charAt(2);
    StringBuilder result = new StringBuilder();
​
    for(char ch= start; ch <= end; ch++){
      result.append(ch);
    
    }
  return result.toString();
  }
}