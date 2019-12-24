import java.util.*;
class Set_8_P12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int n = sc.nextInt();
      int len = s.length();
      //String ans  = (char)s.charAt(len-2)+(char)s.charAt(len-1);
      StringBuilder sb = new StringBuilder("");
      for( int i=len-n;i<len;i++){
            sb.append(s.charAt(i));
      }
      StringBuilder sb1 = new StringBuilder("");
      while(n--!=0)
      {
          sb1.append(sb);
      }
      System.out.println(sb1);
  }
}
