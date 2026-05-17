public class Kata{
  public static int elevatorDistance(int[] arr){
    int total = 0;
    
    for(int i = 0; i < arr.length - 1; i++){
      int current = arr[i];
      int next = arr[i + 1];
      
      total += Math.abs(current - next);
    }
    return total;
  }
}