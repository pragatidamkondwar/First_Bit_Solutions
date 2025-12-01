#include<stdio.h>
void vote();//function decleration
void main()
{
	vote();//function call
}
//main function end here
void vote()//function defination
{

	int age= 10;
	if(age>=18)
	{
		printf("you are eligible for voting");
	}
	else
	{
		printf("you are not eligible for voting");
	}
 
}
