public class FakeBinary {
    public static String fakeBin(String numberString) {
      StringBuilder sb = new StringBuilder();
      
      for(int i = 0; i < numberString.length(); i++){
       if (numberString.charAt(i) < '5'){
          sb.append('0');
        }
        else{
         sb.append('1');
        }
      }
      return sb.toString();
    }
}