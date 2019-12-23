import java.math.*;
class Calculator{

    static int power(int num1, int num2){
        return (int)Math.pow(num1,num2);
    }
    static double powerDouble(double num1, int num2){
            return Math.pow(num1,num2);
    }
  }
public class MainCalc{
    public static void main(String[] args) {
        System.out.println(Calculator.power(3,4));
        System.out.println(Calculator.powerDouble(3.5,2));

    }
}
