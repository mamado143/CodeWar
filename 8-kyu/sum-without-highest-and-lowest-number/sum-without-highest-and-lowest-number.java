public class Kata
{
  public static int sum(int[] numbers)
  {
      if (numbers == null || numbers.length < 3) {
            return 0;
        }
​
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
​
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
​
        return sum - min - max;
    }
​
}