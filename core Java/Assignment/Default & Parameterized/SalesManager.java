
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

SalesManager( int i , String str , double n , double A, double t ) //parametered constructor
{
System.out.println("Constructor called");
this.Id=i;
this.Name=str;
this.Salary=n;
this.Incentive=A;
this.Target=t;
}

void setId(int x){
this.Id=x;
}

void setName(String y){
this.Name=y;
}

void setSalary(double A){
this.Salary=A;
}

void setIncentive(double B){
this.Incentive=B;
}

void setTarget(double c){
this.Target=c;
}
//setter ends here

int getId (){
return this.Id;
}

String getName(){
return this.Name;
}

double getSalary(){
return this.Salary;
}

double getIncentive(){
return this.Incentive;
}

double getTarget(){
return this.Target;
}
//getter ends here

void Display(){
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
SalesManager s1,s2;
s1=new SalesManager();
s1.setId(101);
s1.setName("Sapna");
s1.setSalary(87000.00);
s1.setIncentive(4000.00);
s1.setTarget(3000.00 );

s2=new SalesManager();
s2.setId(102);
s2.setName("Shruti");
s2.setSalary(80000.00);
s2.setIncentive(4500.00);
s2.setTarget(3000.00);


SalesManager s3;
s3=new SalesManager();


SalesManager s4;
s4=new SalesManager(104,"Radha",5000,4000,20);

//System.out.println("Id:"+s1.Id+"/Name:"+s1.Name+"/Salary:"+s1.Salary+"/Incentive:"+s1.Incentive+"/Target:"+s1.Target);

if(s1.getSalary() >s2.getSalary())
{
System.out.println("s1 salary is greater");
}
else
{
System.out.println("s2 salary is greater");
}
s1.Display();
s2.Display();
s3.Display();
s4.Display();
}
}//class Admin Test end here
