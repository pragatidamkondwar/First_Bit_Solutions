#include<stdio.h>
void triangle();//function decleration
void main()
{
triangle();//function call	
}
//main function end here
void trinagle()//function defination
{
		int a=10, b=10, c=30;
		if(a==b&&b==c)
			printf("equilateral");
		else
			if(a==b||b==c||a==c)
				printf("isosceles");
			else
				printf("scalene");
}