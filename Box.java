class Box{
     double width;
     double height;
     double  depth;
    void initializer(double width, double height, double depth )
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
     double volume(){
        double vol = width * depth * height;
        return vol;
    }
  public static void main(String args[]){
        Box b = new Box();
        b.initializer(10.5,12.5,13.5);
        double ans = b.volume();
        System.out.println("Volume ="+ans);
  }
}
