import java.util.Scanner;
class Student
{
int RollNo;
String Name;
double Marks;

Student() //Default constructor
{
System.out.println("Constructor called");
this.RollNo=103;
this.Name="Janvi";
this.Marks=70;
}

Student( int i , String str , double n ) //parametered constructor
{
System.out.println("Constructor called");
this.RollNo=i;
this.Name=str;
this.Marks=n;
}

void setRollNo(int x){
this.RollNo=x;
}

void setName(String y){
this.Name=y;
}

void setMarks(double z){
this.Marks=z;
}
//setter ends here

int getRollNo(){
return this.RollNo;
}

String getName(){
return this.Name;
}

double getMarks(){
return this.Marks;
}
          
//getter ends here

void Display(){
System.out.println("Id is:"+this.RollNo);  
System.out.println("Name is:"+this.Name); 
System.out.println("Marks:"+this.Marks);
}
//Display ends here
 

}//class Student ends here

class StudentTest
{
public static void main (String [] args)
{
Student [] arr= new Student[3];
arr[0]=new Student();
arr[1]=new Student(1,"qw",78);
for(int i=0 ; i<3;i++)
{
System.out.println(arr[i]);
arr[i].Display();
}
Scanner sc=new Scanner (System.in);

System.out.println("Enter the RollNo");
int a = sc.nextInt();

sc.nextLine(); 

System.out.println("Enter the Name");
String str = sc.nextLine();

System.out.println("Enter the Marks");
double d1 = sc.nextDouble();

Student s1;
s1=new Student(a ,str,d1 );

s1.Display();

}
}//class Student Test end here
