import java.util.Scanner;
class Complex
{
double real , imaginary;

Complex ()// default constructor
{
System.out.println(" default constructor called");
this.real=10;
this.imaginary=15;
}

Complex(double r , double i)//parameterized constructor
{
System.out.println("parameterized Constructor called");
this.real=r;
this.imaginary=i;
}

void setreal(double r){
this.real=r;
}

void setimaginary(double i){
this.imaginary=i;
}

double getreal(){
return this.real;
}

double getimaginary(){
return this.imaginary;
}
//getter ends here

void Display(){
System.out.println("real no"+this.real);
System.out.println("imaginary no "+this.imaginary);
 }
}
// class complex ends here

class ComplexTest
{
public static void main(String [] args)
{

Distance [] arr = new Distance [3];
arr[0]=new Distance();
arr[1]=new Distance(12,1);
for(int i=0;i<3;i++){
System.out.println(arr[i]);
arr[i].Display();
}

Scanner sc=new Scanner (System.in);

System.out.println("Enter the real number");
double d1 = sc.nextDouble();

System.out.println("Enter the imaginary number");
double d2= sc.nextDouble();


Complex c1;
c1=new Complex(d1 , d2);

c1.Display();

 }
}
//class ComplexTest end here

