class Complex
{
double real , imaginary;

Complex ()// default constructor
{
System.out.println("constructor called");
this.real=10;
this.imaginary=15;
}
Complex(double r , double i) //parametered constructor
{
System.out.println(" p Constructor called");
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

double getimaginary()
return this.imaginary;
}
//getter ends here

void Display (){
System.out.println("real no"+this.real);
System.out.println("imaginary no "+this.imaginary);
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

Complex c2;
c2=new Complex();
c2.setreal(5);
c2.setimaginary(5.0);

Complex c3;
c3=new Complex();


Complex c4;
c4=new Complex( 200,300);


printer p1= new printer ();
p1.print();
p1.print(10);
p1.print("a");
p1.print("Sachin");

//System.out.println("real:"+c1.real+"/imaginary:"+c1.imaginary);
if(c1.getimaginary() >c2.getimaginary())
{
System.out.println("c1 is Larger");
}
else
{
System.out.println("c2 is Larger");
}

c1.Display();
c2.Display();
c3.Display();
c4.Display();
}
}
//class ComplexTest end here





