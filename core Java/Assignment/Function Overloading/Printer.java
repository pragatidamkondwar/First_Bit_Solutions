class Printer
{
void print()
{
System.out.println("Hello");
}
void print( int a)
{
System.out.println( a);
}
void print (char b)
{
System.out.println( b);
}
void print (String s);
{
System.out.print(s);
}
}

class Test
{
public static void main(String[] args)
{
Printer p1;
p1 = new Printer();
p1.print();
p1.print(10 );
p1.print( 's');
p1.print("Sachin");
 }
}