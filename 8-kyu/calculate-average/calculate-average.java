public class Kata {
    public static double findAverage(int[] array) {
     if ( array  == null || array.length == 0)
        return 0.0;
        
    
      int sum =0;
      for (int value : array){
        sum += value;
      }
      double average = (double) sum / array.length;
      
      return average;
      
     }
​
}