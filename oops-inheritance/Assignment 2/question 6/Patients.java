class Patient{
    String Pname;
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double BMI()
    {
       
       return ((weight/(height*height))*703);
    }
}
    class Patients
{
  public static void main (String[] args)
 {
  Patient p=new Patient(65,126);
  System.out.println("The BMI:"+p.BMI());
  
 }
}
