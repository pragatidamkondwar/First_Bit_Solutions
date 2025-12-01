#include<stdio.h>
void avg();//function decleration
void main()
{
	 avg();//function call
	 
}
// main function end here
void avg()//function defination
{
	 int a = 2, b=3 , c=4 ,d=5 , e=6 , sum , avg;
	 sum=a + b + c + d + e ;
	 avg=sum / 5;
	 printf("enter five number %d",avg);
}