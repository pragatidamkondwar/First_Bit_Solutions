import java.util.Scanner;
class Date
{
int Day , month , year;
String Dow;

Date()//Default constructor
{
this.Day=8;
this.month=11;
this.year=2025;
this.Dow="Saturday";
}

Date(int day , int month , int year , String Dow)//parameterized constructor 
{
this.Day=day;
this.month=month;
this.year=year;
this.Dow=Dow;
}

int getday(){
return this.Day;
}

int getmonth(){
return this.month;
}

int getyear(){
return this.year;
}

int getDow(){
return this.year;
}
// getter end here

void setDay(int d){
this.Day=d;
}

void setmonth(int m){
this.month=m;
}

void setyear(int y){
this.year=y;
}

void setDow(String d){
this.Dow=d;
}
// setter end here

void Display(){
System.out.println(" Day is:"+this.Day);
System.out.println(" month is:"+this.month);
System.out.println(" year is:"+this.year);
System.out.println(" Dow is:"+this.Dow);
}
// Display end here

}// class Date end here

class Test
{
public static void main(String [] args)
{
Date [] arr= new Date[3];
arr[0]=new Date();
arr[1]=new Date(1,11,2025,"sunday");
for(int i=0 ;i<3;i++)
{
System.out.println(arr[i]);
//arr[i].Display();
}

Scanner sc=new Scanner(System.in);

System.out.println("Enter the day");
int a= sc.nextInt();

System.out.println("Enter the month");
int b= sc.nextInt();

System.out.println("Enter the year");
int c= sc.nextInt();

sc.nextLine();

System.out.println("Enter the day of week");
String str= sc.nextLine();

Date d1= new Date(a,b,c,str);
d1.Display();
 }
}




