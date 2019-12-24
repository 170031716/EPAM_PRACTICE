import java.util.*;
class Concat{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    StringBuilder a = new StringBuilder(sc.next());
    StringBuilder  b = new StringBuilder(sc.next());
      int len = a.length();

      if(a.charAt(len-1)==b.charAt(0)){
              b.deleteCharAt(0);
              a.append(b);
              }
              else
              a.append(b);

              System.out.println(a);

  }
}
