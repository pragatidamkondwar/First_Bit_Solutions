class Car
{
String model, brand , color;
double price, fuelcapacity;

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

System.out.println("model:"+c1.model+"/brand:"+c1.brand+"/color:"+c1.color+"/price:"+c1.price+"/fuelcapacity:"+c1.fuelcapacity);
}
}
//class carTest end here





