import java.util.ArrayList;
​
public class MonkeyCounter
  
{
  public static int[] monkeyCount(final int n){
    int[] number = new int[n];
    //List<String> number = new ArrayList<>(n);
​
    
    for(int i = 0; i < n; i++){
    number[i] = i + 1;
    }
    return number;
  }
}