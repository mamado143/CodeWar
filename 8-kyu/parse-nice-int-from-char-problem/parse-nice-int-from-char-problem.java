public class CharProblem {
  public static int howOld(final String herOld) {
// Step 1: Get the first character of the string
    // Example: "5 years old" -> '5'
    char firstChar = herOld.charAt(0);
​
    // Step 2: Convert the char into a String
    // '5' -> "5"
    String numberStr = String.valueOf(firstChar);
​
    // Step 3: Convert the String into an integer
    // "5" -> 5
    int age = Integer.parseInt(numberStr);
​
    // Step 4: Return the final integer value
    return age;
}}
​