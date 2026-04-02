public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    // show me the code!
    int total = 0;
    if(bonus == true) {
      total = salary * 10;
      }
    else {
            total = salary;
    }
    return "\u00A3" + total;
  }
}