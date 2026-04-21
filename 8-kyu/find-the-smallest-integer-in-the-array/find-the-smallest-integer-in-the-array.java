public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
     if (args == null) {
    return -1;
}
        int min = args[0]; //this to save the min index
      for (int i = 1; i < args.length; i++){
      
        if(args[i] < min){
          min = args[i];
        }
      }
        return min;
    }
}