public class Solution {
​
    public static boolean check(Object[] a, Object x) {
        // Your code here
      for(Object i : a){
        if (x == (null)){
          return false;
        }
        else{
          if(x.equals(i))
            return true;
        }
      }
      return false;
    }
​
}