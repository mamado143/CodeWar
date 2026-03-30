public class Kata {
​
  public static boolean feast(String beast, String dish) {
//     char firstIndex = beast.charAt(0);
//     char lastIndex = beast.charAt(beast.length() -1);
    
//       char dishFirstIndex = dish.charAt(0);
//     char dishLastIndex = dish.charAt(dish.length() -1);
    
//     if (firstIndex == dishFirstIndex && lastIndex ==  dishLastIndex){
//       return true;
//     }
    return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() -1) == dish.charAt(dish.length() -1);
    
  }
  
}
  