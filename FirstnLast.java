import java.util.*;
class FirstnLast{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StringBuilder  s = new StringBuilder(sc.next());
      String ans = s.substring(1,s.length()-1);
      System.out.println(ans);

  }
}
