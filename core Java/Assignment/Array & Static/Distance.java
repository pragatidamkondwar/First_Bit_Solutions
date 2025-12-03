import java.util.Scanner;
class Distance
{
int Km,M;

Distance()// default Constructor
{
System.out.println("constructor called");
this.Km=10;
this.M=5;
}

Distance(int r , int i) //parameterized constructor
{
System.out.println("Constructor called");
this.Km=r;
this.M=i;
}

void setKm(int x){
this.Km=x;
}

void setM(int y){
this.M=y;
}

//setter ends here

int getKm(){
return this.Km;
}

int getM(){
return this.M;
}
//getter ends here
     
void Display(){
System.out.println("Km:"+this.Km); 
System.out.println("m:"+this.M);
}
 
//display ends here  

}//class Distance ends here

class DistanceTest
{
public static void main (String [] args)
{

Distance [] arr = new Distance [3];
arr[0]=new Distance();
arr[1]=new Distance(12,1);
for(int i=0;i<3;i++){
System.out.println(arr[i]);
arr[i].Display();
}

Scanner sc=new Scanner (System.in);

System.out.println("Enter the  Km");
int a = sc.nextInt();

System.out.println("Enter the m ");
int b = sc.nextInt();

Distance d = new Distance ( a , b);

 }
}//class Distance Test end here
