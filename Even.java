import java.util.*;
class Even{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = ""; int x = s.length()/2;
    if(s.length()%2!=0)
      return;
      else{
        ans = s.substring(0,x);
      }
      System.out.println(ans);
  }
}
