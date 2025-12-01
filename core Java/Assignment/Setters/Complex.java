class Complex
{
double real , imaginary;

void setreal(double r){
this.real=r;
}

void setimaginary(double i){
this.imaginary=i;
 }
}
// class complex ends here

class ComplexTest
{
public static void main(String [] args)
{
Complex c1;
c1=new Complex();
c1.setreal(3);
c1.setimaginary(3.0);

System.out.println("real no:"+c1.real+"/"+"imaginary no:"+c1.imaginary);

}
}
//class ComplexTest end here





