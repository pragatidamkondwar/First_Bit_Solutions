#include<stdio.h>
int average();//function decleration
void main()
{
	 int avg = average();//function call
	 printf("average of the no %d",avg);
	 
}
// main function end here
int average()//function defination
{
	int a = 2, b=3 , c=4 ,d=5 , e=6 , sum , avg;
	sum=a + b + c + d + e ;
	return avg=sum / 5;
}