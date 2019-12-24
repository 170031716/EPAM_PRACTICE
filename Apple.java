class Fruit{
  String name, taste,size;
  void eat(){
      System.out.println("the fruits name is this and it doesnt have any taste");
  }
}

class Orange extends Fruit{
  @Override
  void eat(){
    System.out.println("this fruits name is Orange and it has sour taste");
  }
}
 class Apple extends Fruit{
  @Override
  void eat(){
    System.out.println("this fruits name is apple and it has sweet taste");
  }
}
