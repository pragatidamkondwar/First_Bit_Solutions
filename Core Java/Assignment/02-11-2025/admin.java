
class Admin
{
int Id;
String Name;
double salary,Allowance;
void setId(int x)
{
this.Id=x;
}
void setName(String y)
{
this.Name=y;
}
void setsalary(double A)
{
this.salary=A;
}
void setAllowance(double B)
{
this.Allowance=B;
}
//setter ends here

int getId()
   {
    return this.Id;
   }
   String etName()
   {
    return this.Name;
    }
    double  getsalary()
    {
      return this.salary;
     }
   double getAllowance()
   {
    return this.Allowance;
}
 double get()
   {
    return this.Allowance;
}
// getter ends here


void Display()
{
  System.out.println("Id is:"+this.Id);
  
  System.out.println("Name is :"+this.Name);
   

  System.out.println("salary is :"+this.salary);

  
  System.out.println("Allowance:"+this.Allowance);
 }

}

//class Admin ends here

class AdminTest
{
public static void main (String [] args)
{
Admin a1;
a1=new Admin();
a1.setId(101);
a1.setName("Pragati");
a1.setsalary(80000.00);
a1.setAllowance(5000.00);

Admin a2;
a2=new Admin();
a2.setId(102);
a2.setName("shruti");
a2.setsalary(70000.00);
a2.setAllowance(1000.00);

//System.out.println("Id:"+a1.Id+"/Name:"+a1.Name+"/Salary:"+a1.salary+"/Allowance:"+a1.Allowance);

if(a1.getsalary() >a2.getsalary())
{
System.out.println(" a1 is Larger");
}
else
{
System.out.println("a2 is Larger");
}

a1.Display();
a2.Display();



}
}//class Admin Test end here
