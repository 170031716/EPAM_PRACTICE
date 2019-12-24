class Animal{
  public void eat(){
      System.out.println("Animal eats");
  }
  public void sleep(){
      System.out.println("Animal sleeps");
  }
}
public class Bird extends Animal{
  @Override
  public void eat(){
      System.out.println("Bird eats");
  }
  @Override
  public void sleep(){
      System.out.println("Bird sleeps");
  }
  public void fly(){
    System.out.println("Bird flies");
  }
  public static void main(String args[]){
      Animal a = new Animal();
      a.eat();
      a.sleep();
      Bird b = new Bird();
      b.eat();
      b.sleep();
      b.fly();
  }
  }
