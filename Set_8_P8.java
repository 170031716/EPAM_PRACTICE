import java.util.*;
import java.io.*;
class Set_8_P8{
  public static void main(String[] args) throws IOException{
  Scanner sc  = new Scanner(System.in);
  String s = sc.next();
  String app = sc.next();
  int n = sc.nextInt();
   int count=0;
    StringBuilder sb = new StringBuilder("");
    while(true){
        sb.append(s);
        count++;
        if(count==n)
        break;
        else
        sb.append(app);
    }
    System.out.println(sb);
  }
}
