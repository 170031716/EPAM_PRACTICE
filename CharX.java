import java.util.*;
class CharX{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder a = new StringBuilder(sc.next());
    int n = a.length()-1;
      if((a.charAt(0)=='x' || a.charAt(0)=='X') && (a.charAt(n)=='x' || a.charAt(n)=='x')){
          a.deleteCharAt(n);
          a.deleteCharAt(0);
        }
        System.out.println(a);
    }

}
