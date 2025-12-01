
class Distance
{
int Km,M;

void setKm(int x){
this.Km=x;
}
void setM(int y){
this.M=y;
 }     
}//class Distance ends here

class DistanceTest
{
public static void main (String [] args)
{
Distance d1;
d1=new Distance();
d1.setKm(12);
d1.setM(500);

System.out.println("km is:"+d1.Km+"/"+"m is:"+d1.M);
}
}//class Distance Test end here
