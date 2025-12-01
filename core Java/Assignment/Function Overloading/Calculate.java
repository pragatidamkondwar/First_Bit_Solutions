class Calculate
{
void add( int a , int b)
{
System.out.println("Addition");
System.out.println(a+b);
}
void add( double a , double b)
{
System.out.println(a+b);
}
void add( int a , double b)
{
System.out.println(a+b);
}
void add( double a , int b)
{
System.out.println(a+b);
  }

//add method ends here

void sub( int a , int b)
{
System.out.println("Subtraction");
System.out.println(a-b);
}
void sub( double a , double b)
{
System.out.println(a-b);
}
void sub( int a , double b)
{
System.out.println(a-b);
}
void sub( double a , int b)
{
System.out.println(a-b);
  }
//sub method end here

void Mul( int a , int b)
{
System.out.println("Multiplication");
System.out.println(a*b);
}
void Mul( double a , double b)
{
System.out.println(a*b);
}
void Mul( int a , double b)
{
System.out.println(a*b);
}
void Mul( double a , int b)
{
System.out.println(a*b);
  }
//Mul method end here


void Div( int a , int b)
{
System.out.println("Division");
System.out.println(a*b);
}
void Div( double a , double b)
{
System.out.println(a*b);
}
void Div( int a , double b)
{
System.out.println(a*b);
}
void Div( double a , int b)
{
System.out.println(a*b);
  }
//Mul method end here

}
class Test
{
public static void main(String [] args)
{
Calculate c1 , c2 , c3 , c4;

c1=new Calculate();
c1.add(1,2);
c1.add(1.2,2.2);
c1.add(1,2.2);
c1.add(8.9,1);

c2=new Calculate();
c2.sub(5,5);
c2.sub(1.2,2.2);
c2.sub(4,2.2);
c2.sub(8.9,1);

c3=new Calculate();
c3.Mul(5,5);
c3.Mul(1.2,2.2);
c3.Mul(4,2.2);
c3.Mul(8.9,1);

c4=new Calculate();
c4.Div(5,5);
c4.Div(1.2,2.2);
c4.Div(4,2.2);
c4.Div(8.9,1);

 }
}

