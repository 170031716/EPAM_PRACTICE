import java.util.*;
class Set_8_P9{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder(sc.next());
      int findex = s.indexOf("*");
      int lindedx = s.lastIndexOf("*");
      s.replace(findex-1,lindedx+2,"");
      System.out.println(s);
  }
}
