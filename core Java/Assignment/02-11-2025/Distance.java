
class Distance
{
int Km,M;

Distance()// default Constructor
{
System.out.println("constructor called");
this.Km=10;
this.m=5;
} 

Distance(int r , int i) //parametered constructor
{
System.out.println("Constructor called");
this.km=r;
this.m=i;
}

void setKm(int x)
{
this.Km=x;
}
void setM(int y)
{
this.M=y;
}
//setter ends here
     
     int getKm()
     {
     return this.Km;
     }
      int getM()
     {
     return this.M;
     }
     //getter ends here
     
    void Display()
{
  System.out.println("Km:"+this.Km);
  
  System.out.println("m:"+this.M);
 }
 
//display ends here  

}//class Distance ends here

class DistanceTest
{
public static void main (String [] args)
{
Distance d1;
d1=new Distance();
d1.setKm(12);
d1.setM(500);

Distance d2;
d2=new Distance();
d2.setKm(120);
d2.setM(1000);

Distance d3;
d3=new Distance();


//System.out.println("Kilometer:"+d1.Km+"/Meter:"+d1.M);

if(d1.getM() >d2.getM())
{
System.out.println("d1 is Larger");
}
else
{
System.out.println("d2 is Larger");
}

d1.Display();
d2.Display();
d3.Display();
}
}//class Distance Test end here
