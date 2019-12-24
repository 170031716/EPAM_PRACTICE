import java.util.*;
class Short{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a= sc.next();
    String b = sc.next();
    int len1  = a.length();
    int len2 = b.length();
    StringBuilder sb = new StringBuilder("");
    if(len1 < len2)
      sb.append(a).append(b).append(a);
      else
      sb.append(b).append(a).append(b);

      System.out.println(sb);
  }
}
