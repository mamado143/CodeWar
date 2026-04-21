public class School{
​
  public static int getAverage(int[] marks){
    if(marks == null){
      return -1;
    }
   int sum = marks[0];
        int average = marks[0];
        for (int i = 1; i < marks.length; i++){
            sum += marks[i];
        }
        average = sum / marks.length;
​
        return average;
  }
}