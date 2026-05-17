public class Kata{
  public static int elevatorDistance(int[] arr){
    int result = 0;
    
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] < arr[i + 1]){
        result += arr[i + 1] - arr[i];
      }
      else{
        result += arr[i] - arr[i + 1];
      }
    }
    return result;
  }
}