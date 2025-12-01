#include<stdio.h>
void sqaure();//function decelration
void main()
{
	square();//function call
}
//main function end here
void sqaure()//function defination
{
	int a= 5 , b= 2;
	a= 5*5;
	b=2*2*2;
	printf("square of 5 number %d",a);
}
