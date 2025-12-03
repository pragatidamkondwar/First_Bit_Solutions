import java.util.Scanner;
class Product
{
int Pid,Quantity;
String Pname;
double Price;

Product () 
{
System.out.println("Constructor called");
this.Pid=2;
this.Quantity=5;
this.Pname="pista";
this.Price=150;
}

Product( int pi , int Q , String pn, double p) //parametered constructor
{
System.out.println(" parameterized Constructor called");
this.Pid=pi;
this.Quantity=10;
this.Pname=pn;
this.Price=p;
}

void setPid(int a){
this.Pid=a;
}

void setQuantity(int b){
this.Quantity=b;
}

void setPname(String c){
this.Pname=c;
}

void setPrice(double d){
this.Price=d;
}
//setter ends here

int getPid(){
return this.Pid;
}

int getQuantity(){
return this.Quantity;
}

String getPname(){
return this.Pname;
}

double getPrice(){
return this.Price;
}
//getter end here

void Display()
{
System.out.println("pid is:"+this.Pid);  
System.out.println("Quantity:"+this.Quantity);
System.out.println("Pname:"+this.Pname);  
System.out.println("Price:"+this.Price);
 }

}//class Product ends here

class ProductTest
{
public static void main (String [] args)
{
Product [] arr=new Product[3];
arr[0]=new Product();
arr[1]=new Product(1,12,"Kaju",500);
for(int i=0;i<3;i++)
{
System.out.println(arr[i]);
arr[i].Display();
}

Scanner sc=new Scanner (System.in);

System.out.println("Enter the Id");
int a = sc.nextInt();

System.out.println("Enter the Quantity");
int b = sc.nextInt();

sc.nextLine();

System.out.println("Enter the Pname");
String str = sc.nextLine();

System.out.println("Enter thePrice");
double d1= sc.nextDouble();

Product p1;
p1=new Product(a ,b, str, d1);

p1.Display();

}
}//class Product Test end here
