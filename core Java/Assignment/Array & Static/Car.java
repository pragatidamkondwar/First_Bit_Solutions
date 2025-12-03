import java.util.Scanner;
class Car
{
String model, brand , color;
double price, fuelcapacity;

Car() //Default constructor
{
System.out.println(" Default Constructor called");
this.model="MAhindra";
this.brand="XUV700";
this.color="gray";
this.price=90000;
this.fuelcapacity=2000;
}

Car( String s , String b , String c , double p , double fc) //parameterized constructor
{
System.out.println("parameterized Constructor called");
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

void setfuelcapacity(double e){
this.fuelcapacity=e;
}
// setter ends here

String getmodel(){
return this.model;
}

String getbrand(){
return this.brand;
}

String getcolor(){
return this.color;
}

double getprice(){
return this.price;
}

double getfuelcapacity(){
return this.fuelcapacity;
}

// getter ends here

void Display(){
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
Car [] arr=new Car[3];
arr[0]=new Car();
arr[1]=new Car("scv","Honda","white",70000,1000);
for(int i=0;i<3;i++)
{
System.out.println(arr[i]);
//arr[i].Display();
}
Scanner sc=new Scanner (System.in);

System.out.println("Enter the model");
String str1 = sc.nextLine();

System.out.println("Enter the brand");
String str2 = sc.nextLine();

System.out.println("Enter the color");
String str3 = sc.nextLine();

System.out.println("Enter the price");
double d1= sc.nextDouble();

System.out.println("Enter  the fuelcapacity");
double d2= sc.nextDouble();

Car c1;
c1=new Car(str1 ,str2, str3, d1 , d2);

c1.Display();
 }
}
//class carTest end here





