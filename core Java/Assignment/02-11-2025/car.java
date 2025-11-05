class Car
{
String model, brand , color;
double price, fuelcapacity;

void setmodel(String a)
{
this.model=a;
}
void setbrand(String b)
{
this.brand=b;
}
void setcolor(String c)
{
this.color=c;
}

void setprice(double d)
{
this.price= d;
}
void setfuelcapacity(double e)
{
this.fuelcapacity=e;
}
// setter ends here
 

   String getmodel()
   {
    return this.model;
   }
   String getbrand()
   {
    return this.brand;
    }
    String getcolor()
    {
      return this.color;
     }
   double getprice()
   {
    return this.price;
}
double getfuelcapacity()
   {
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
Car c1;
c1=new Car();
c1.setmodel("sport");
c1.setbrand("Suzuki");
c1.setcolor("blue");
c1.setprice(500000);
c1.setfuelcapacity(5000);

Car c2;
c2=new Car();
c2.setmodel("Nexon");
c2.setbrand("Hyundai");
c2.setcolor("white");
c2.setprice(800000);
c2.setfuelcapacity(6000);


System.out.println("model:"+c1.model+"/brand:"+c1.brand+"/color:"+c1.color+"/price:"+c1.price+"/fuelcapacity:"+c1.fuelcapacity);

if(c1.getprice() >c2.getprice())
{
System.out.println("c1 is Larger");
}
else
{
System.out.println("c2 is Larger");
}

c1.Display();
c2.Display();

}
}
//class carTest end here





