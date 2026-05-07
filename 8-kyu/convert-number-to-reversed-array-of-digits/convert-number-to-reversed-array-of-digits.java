public class Kata {
  public static int[] digitize(long n) {
    // Code here
 return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    
  }
}