import java.util.Scanner;
class Car
{
String model, brand , color;
double price, fuelcapacity;

Car() //Default constructor
{
System.out.println("Constructor called");
this.model="MAhindra";
this.brand="XUV700";
this.color="gray";
this.price=90000;
this.fuelcapacity=2000;
}

Car( String s , String b , String c , double p , double fc) //parametered constructor
{
System.out.println("Constructor called");
this.model=s;
this.brand=b;
this.color=c;
this.price=p;
this.fuelcapacity=fc;
}

void setmodel(String a){
this.model=a;
}
void setbrand(String b){
this.brand=b;
}
void setcolor(String c){
this.color=c;
}

void setprice(double d){
this.price= d;
}
void setfuelcapacity(double e)
this.fuelcapacity=e;
}
// setter ends here
 
String getmodel(){
return this.model;
}

String getbrand()
return this.brand;
}

String getcolor()
return this.color;
}

double getprice()
return this.price;
}

double getfuelcapacity()
return this.fuelcapacity;
}

// getter ends here

void Display()
{
System.out.println("model is:"+this.model);
System.out.println("brand:"+this.brand);
System.out.println("color:"+this.color);  
System.out.println("price:"+this.price);  
System.out.println("fuelcapacity:"+this.fuelcapacity);
 }
}
// class car ends here

class CarTest
{
public static void main(String [] args)
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);

System.out.println("Enter the model");
int str1 = sc.nextLine();

sc.nextLine(); 

System.out.println("Enter the brand");
String str2 = sc.nextLine();

System.out.println("Enter the color");
String str3 = sc.nextLine();

System.out.println("Enter the price");
double d1= sc.nextDouble();

System.out.println("Enter  the fuelcapacity");
double d2= sc.nextDouble();

Car c1;
c1=new BankAccount(a ,str,d1 , d2);

c1.Display();
 }
}
//class carTest end here





