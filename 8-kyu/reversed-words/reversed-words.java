public class ReverseWords{
​
 public static String reverseWords(String str){
     //write your code here...
   String result = "";
   String temp = "";
   
   for(int i = 0 ; i < str.length(); i++){
     if(str.charAt(i) == ' '){
       result = temp + " " + result;
       temp = "";
     }
     else {
       temp += str.charAt(i);
     }
     }
  // add last word
    result = temp + " " + result;
​
    return result.trim();
 }
}