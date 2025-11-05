
class Student
{
int RollNo;
String Name;
double Marks;
void setRollNo(int x)
{
this.RollNo=x;
}
void setName(String y)
{
this.Name=y;
}
void setMarks(double z)
{
this.Marks=z;
}

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

System.out.println("RollNo :"+s1.RollNo+"/Name:"+s1.Name+"/Marks:"+s1.Marks);
}
}//class Student Test end here
