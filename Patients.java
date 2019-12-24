class Patient{
    String name;
    double weight;
    double height;
    Patient(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    double BMI(){
      double bmi = ((weight)/(height * height)) * 703;
      return bmi;
    }
}
class Patients{
  public static void main(String args[]){
        Patient p = new Patient("sasa", 180, 172);
        double ans = p.BMI();
        System.out.println("BMI of the person is ="+ans);
  }
}
