#include<stdio.h>
void leapyear();//function decleration
void main()
{
 leapyear();//function call
}
//main function end here
void leapyear()//function defination
{
	int year=2004;
	if(year%4==0 && year%100!=0)
	{
		printf("2004 year is leap year");
	}
	else
	{
		printf("2004 year is not leap year");
	}
}