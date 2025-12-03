import java.util.Scanner;
class HR
{
int Id;
String Name;
double Salary,Commission;

HR() //Default constructor
{
System.out.println(" Default Constructor called");
this.Id=101;
this.Name="Pragati";
this.Salary=20000;
this.Commission=10;
}

HR( int i , String str , double n , double A) //parameterized constructor
{
System.out.println(" parameterized Constructor called");
this.Id=i;
this.Name=str;
this.Salary=n;
this.Commission=A;
}

void setId(int x)
{
this.Id=x;
}
void setName(String y)
{
this.Name=y;
}
void setSalary(double A)
{
this.Salary=A;
}
void setCommission(double B)
{
this.Commission=B;
}

int getId()
   {
    return this.Id;
   }
   String getName()
   {
    return this.Name;
    }
    double  getSalary()
    {
      return this.Salary;
     }
   double getCommission()
   {
    return this.Commission;
}
 
// getter ends here

void Display()

{
  System.out.println("Id is:"+this.Id);
  
  System.out.println("Name is :"+this.Name);
   
  System.out.println("Salary is :"+this.Salary);

  System.out.println("Commission:"+this.Commission);
 }
}//class HR ends here

class HRTest
{
public static void main (String [] args)
{
/*Scanner sc=new Scanner ( System.in);
System.out.println("Enter the id");
int a = sc.nextInt();

sc.nextLine();

System.out.println("Enter the Name");
String str = sc.nextLine();


System.out.println("Enter the Salary");
double d1 = sc.nextDouble();

System.out.println("Enter the Commission");
double d2= sc.nextDouble();*/

HR arr[]=new HR[3];
arr[0]=new HR();
arr[1]=new HR(7,"qyqw",12,67);

for(int i=0;i<6;i++)
{
System.out.println(arr[i]);
//arr[i].Display();
}
}
}//class HR Test end here

