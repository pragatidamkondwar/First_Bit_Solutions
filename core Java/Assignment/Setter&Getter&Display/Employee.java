
class Employee
{
int Id;
String Name;
double Salary;

void setId(int x){
this.Id=x;
}

void setName(String y){
this.Name=y;
}

void setSalary(double z){
this.Salary=z;
}

int getId(){
return this.Id;
}

String getName(){
return this.Name;
}

double getSalary()
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
Employee e1;
e1=new Employee();
e1.setId(101);
e1.setName("shruti");
e1.setSalary(55000.00);

Employee e2;
e2=new Employee();
e2.setId(102);
e2.setName("Pragati");
e2.setSalary(50000.00);

//System.out.println("Id:"+e1.Id+"/Name:"+e1.Name+"/Salary:"+e1.Salary);

if(e1.getSalary() >e2.getSalary()){
System.out.println(" e1 is Larger");
}
else{
System.out.println("e2 is Larger");
}
e1.Display();
e2.Display();
 }
}//Employee Test end here
