class Employee extends Person{
  double salary;
  int yearofjoin;
  String insurancenum;

   Employee(double salary, int yearofjoin, String insurancenum){
      this.salary = salary;
      this.yearofjoin = yearofjoin;
      this.insurancenum = insurancenum;
  }
  public void details(){
    Person p = new Person();
      System.out.println(p.name+"  "+"Started working sice "+ yearofjoin+" and his current salary is"+salary+"and his insurance number is "+insurancenum);
  }

}
