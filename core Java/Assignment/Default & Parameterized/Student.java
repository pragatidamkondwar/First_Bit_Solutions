
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
Student s1;
s1=new Student();
s1.setRollNo(101);
s1.setName("Pragati");
s1.setMarks(85.00);

Student s2;
s2=new Student();
s2.setRollNo(102);
s2.setName("shruti");
s2.setMarks(90.00);

Student s3;
s3=new Student();

Student s4;
s4=new Student(104,"geeta",79);

//System.out.println("Id:"+s1.Id+"/Name:"+s1.Name+"/Marks:"+s1.Marks);


if(s1.getMarks() >s2.getMarks())
{
System.out.println("s1 is greater");
}
else
{
System.out.println("s2 is greater");
}

s1.Display();
s2.Display();
s3.Display();
s4.Display();
}
}//class Student Test end here
