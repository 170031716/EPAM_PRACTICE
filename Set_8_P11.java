import java.util.*;
class Set_8_P11{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      int len1 = a.length();
      int len2 = b.length();
      StringBuilder sb = new StringBuilder("");
      int i=0,j=0;
      for(; i<len1 && j<len2;i++,j++){
            sb.append(a.charAt(i)).append(b.charAt(j));
      }
        if(i<len1)
        sb.append(a.substring(i,len1));
        else if(j < len2)
        sb.append(b.substring(j,len2));

      System.out.println(sb);
      }
}
