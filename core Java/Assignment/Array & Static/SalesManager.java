import java.util.Scanner;
class SalesManager
{
int Id;
String Name;
double Salary,Incentive,Target;

SalesManager() //Default constructor
{
System.out.println("Constructor called");
this.Id=103;
this.Name="Shreesha";
this.Salary=2000;
this.Incentive=1000;
this.Target=5;
}

SalesManager( int i , String str , double n , double A, double t ) //parameterized constructor
{
System.out.println("parameterized Constructor called");
this.Id=i;
this.Name=str;
this.Salary=n;
this.Incentive=A;
this.Target=t;
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
void setIncentive(double B)
{
this.Incentive=B;
}
void setTarget(double c)
{
this.Target=c;
}
//setter ends here

        int getId ()
        {
        return this.Id;
        }
        String getName()
        {
        return this.Name;
        }
        double getSalary()
        {
         return this.Salary;
        }
        double getIncentive()
        {
        return this.Incentive;
        }
        double getTarget()
        {
        return this.Target;
        }
        //getter ends here

 void Display()
{
System.out.println("ID is:"+this.Id);

System.out.println("Name is:"+this.Name);

System.out.println("Salary is:"+this.Salary);

System.out.println("Incentive is:"+this.Incentive);

System.out.println("Target is:"+this.Target);
}
//Display ends here
}//class SalesManager ends here

class SalesManagerTest
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
double d1 = sc.nextDouble();

System.out.println("Enter the Incentive");
double d2= sc.nextDouble();

System.out.println("Enter the Target");
double d3= sc.nextDouble();*/

SalesManager arr[]=new SalesManager[3];
arr[0]=new SalesManager();
arr[1]=new SalesManager(7,"qyqw",12,67,12);
for(int i=0;i<3;i++)
{
System.out.println(arr[i]);
//arr[i].Display();
}

}
}//class SalesManagerTest Test end here
