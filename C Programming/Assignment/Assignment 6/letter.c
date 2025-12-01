#include<stdio.h>
void main()
{
	letter();//function call
}
//main function end here
void letter()//function defination
{
char ch='P';
	if(ch>='A'&& ch<='Z')
	{
		printf("it is uppercase letter");
	}
	else
	{
		printf("it is lowercase letter");
	}
}