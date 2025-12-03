import java.util.Scanner;
class Admin
{
int Id;
String Name;
double salary,Allowance;

Admin() //Default constructor
{
System.out.println("Default Constructor called");
this.Id=4;
this.Name="xyz";
this.salary=1984;
this.Allowance=1000;
}

Admin( int i , String str , double n , double A) //parameterized constructor
{
System.out.println("parameterized Constructor called");
this.Id=i;
this.Name=str;
this.salary=n;
this.Allowance=A;
}

void setId(int x){
this.Id=x;
}

void setName(String y){
this.Name=y;
}

void setsalary(double A){
this.salary=A;
}

void setAllowance(double B){
this.Allowance=B;
}
//setter ends here

int getId(){
return this.Id;
}

String getName(){
return this.Name;
}

double  getsalary(){
return this.salary;
}

double getAllowance(){
return this.Allowance;
}

double get(){
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
Scanner sc=new Scanner (System.in);

Admin  [] arr= new Admin[3];
arr[0]=new Admin();
arr[1]=new Admin(1, "qww",12399,12);
for(int i=0;i<3;i++){
System.out.println(arr[i]);
arr[i].Display();
}

System.out.println("Enter the Id");
int a = sc.nextInt();

sc.nextLine(); 

System.out.println("Enter the Name");
String str = sc.nextLine();

System.out.println("Enter the salary");
double d1 = sc.nextDouble();

System.out.println("Enter the Allowance");
double d2= sc.nextDouble();

Admin a1=new Admin();
a1.Display();
}
}//class Admin Test end here
