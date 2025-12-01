
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
System.out.println("Constructor called");
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

double getPrice()
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
Product p1;
p1=new Product();
p1.setPid(1122);
p1.setQuantity(500);
p1.setPname("Almond");
p1.setPrice(450.00);

Product p2;
p2=new Product();
p2.setPid(1130);
p2.setQuantity(200);
p2.setPname("cashew");
p2.setPrice(550.00);


Product p3;
p3=new Product();


Product p4;
p4=new Product();



//System.out.println("Product_id:"+p1.Pid+"/Quantity:"+p1.Quantity+"/Product_name:"+p1.Pname+"/Product_price:"+p1.Price);

if(p1.getPrice() >p2.getPrice())
{
System.out.println("p1 is Larger");
}
else
{
System.out.println("p2 is Larger");
}

p1.Display();
p2.Display();
p3.Display();
p4.Display();

}
}//class Product Test end here
