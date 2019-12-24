import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder  sb = new StringBuilder(sc.next());
        String s = sb.toString();
          sb.reverse();
          if(s.equalsIgnoreCase(sb.toString()))
            System.out.println("yes");
            else
            System.out.println("no");
    }
}
