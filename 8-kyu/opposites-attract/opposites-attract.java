public class OppositesAttract {
​
  public static boolean isLove(final int flower1, final int flower2) {
    //Seniorio one 
     if(flower1 %2 == 0 && flower2 %2 != 0){
      return true;
       }
    //Senario two
    else if (flower1 %2 != 0 && flower2 %2 == 0){
      return true;
      }
    else {
    return false;
      }
  }  
}