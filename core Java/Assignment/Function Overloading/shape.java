class shape
{
void area(double base , double height)//Triangle
{
double A=1.5*base*height;
System.out.println("area of the Triangle:"+A);
}

void area(int length, int breath)//Reactangle
{
double b=length * breath ;
System.out.println("area of Reactangle:"+b);
}

void area (double radius)//Circle
{
double pi=3.14;
double c = pi*radius*radius;
System.out.println("area of the circle:"+c);
  }
}
class shapeTest
{
public static void main(String[] args)
{
int a =5;
double b=10;

shape s1;
s1=new shape();
s1.area(b ,b);

s1=new shape();
s1.area(a,a);

s1=new shape();
s1.area(b);
 }
}