class Time
{
 int hr , min , sec;

void add ( int h , int m , int s)
{
hr= hr+h;
min= min+m;
sec = sec+s;

if(sec>=60)
{
sec = sec - 60 ;
min = min + 1 ;
}

if ( min >= 60)
{
min = min - 60 ;
hr = hr + 1;
}

if( hr >= 24)
{
hr= hr  - 24 ;
}
System.out.println( " time is " +hr + ":" + min+ ":" + sec);
 }
}
class TimeTest
{
public static void main(String [] args)
{
 int hr= 25 , min=11 , sec = 50;

Time t1;
t1= new Time();
t1.add( hr , min , sec);


Time t2;
t2= new Time();
t2.add( hr , min , sec);

 }
} 




 