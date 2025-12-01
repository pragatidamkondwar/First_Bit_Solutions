
class HR
{
int Id;
String Name;
double Salary,Commission;

HR() //Default constructor
{
System.out.println("Constructor called");
this.Id=4;
this.Name="niya";
this.Salary=40000;
this.Commission=3000;
}

HR( int i , String str , double n , double A) //parametered constructor
{
System.out.println("Constructor called");
this.Id=i;
this.Name=str;
this.Salary=n;
this.Commission=A;
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

void setCommission(double B){
this.Commission=B;
}

int getId(){
return this.Id;
}

String getName(){
return this.Name;
}

double getSalary(){
return this.Salary;
}

double getCommission(){
return this.Commission;
} 
// getter end here

void Display(){
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
HR h1;
h1=new HR();
h1.setId(101);
h1.setName("Akshay");
h1.setSalary(96000.00);
h1.setCommission(6000.00);

HR h2;
h2=new HR();
h2.setId(102);
h2.setName("Avi");
h2.setSalary(10000.00);
h2.setCommission(1000.00);

HR h3;
h3=new HR();

HR h4;
h4=new HR(103,"rani",50000,2000);


//System.out.println("Id:"+h1.Id+"/Name:"+h1.Name+"/Salary:"+h1.Salary+"/Commission:"+h1.Commission);

if(h1.getSalary() >h2.getSalary())
{
System.out.println(" h1 is Larger");
}
else
{
System.out.println("h2 is Larger");
}

h1.Display();
h2.Display();
h3.Display();
h4.Display();
}
}//class HR Test end here
