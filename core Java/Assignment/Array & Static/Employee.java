import java.util.Scanner;
class Employee
{
int Id;
String Name;
double Salary;

Employee() //Default constructor
{
System.out.println("Constructor called");
this.Id=103;
this.Name="Pragati";
this.Salary=20000;
}

Employee( int i , String str , double n ) //parameterized constructor
{
System.out.println(" Parameterized Constructor called");
this.Id=i;
this.Name=str;
this.Salary=n;
}

void setId(int x)
{
this.Id=x;
}
void setName(String y)
{
this.Name=y;
}
void setSalary(double z)
{
this.Salary=z;
}

int getId()
   {
    return this.Id;
   }
   String etName()
   {
    return this.Name;
    }
    double  getSalary()
    {
      return this.Salary;
}

void Display()
{
  System.out.println("Id is:"+this.Id);
  
  System.out.println("Name is :"+this.Name);
   
  System.out.println("salary is :"+this.Salary);
}

}//Employee ends here

class EmployeeTest
{
public static void main (String [] args)
{
/*Scanner sc=new Scanner (System.in);

System.out.println("Enter the Id");
int a = sc.nextInt();

sc.nextLine(); 

System.out.println("Enter the Name");
String str = sc.nextLine();

System.out.println("Enter the salary");
double d1 = sc.nextDouble();*/

Employee arr[]=new Employee[3];
arr[0]=new Employee();
arr[1]=new Employee(7,"qyqw",12);


for(int i=0;i<3;i++)
{
System.out.println(arr[i]);
}
//arr[i].Display();
}
}//Employee Test end here
