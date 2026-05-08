public class TrafficLights {
​
  public static String updateLight(String current) {
  // current is green return str (light to next)
    String red = "red";
    String yellow = "yellow";
    String green = "green";
    
    if (red.equals(current)) {
            return green;
        } else if (yellow.equals(current)) {
            return red;
        } else if (green.equals(current)) {
            return yellow;
        } else {
            return current;
        }
  }
  
}