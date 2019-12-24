import java.util.*;
class Copy{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String sb = sc.next();
      String s = (char)sb.charAt(0)+""+(char)sb.charAt(1);
      StringBuilder sb1= new StringBuilder(s);
      for(int i=1; i<sb.length();i++){
          sb1.append(s);
      }
      System.out.println(sb1);
  }
}
