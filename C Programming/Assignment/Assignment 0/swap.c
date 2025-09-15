#include<stdio.h>
void swap();//function decleration
void main()
{
	swap();//function call
	
}
//main end here
{
void swap()//function defination
int a= 10 , b =5, tem;
	tem= a;
	a=b;
	b=tem;
	printf("swap two numbers: a=%d, b=%d",a,b);
}