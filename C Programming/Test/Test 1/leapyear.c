#include<stdio.h>
void main()
{
	int year;
	printf("enter the year");
	scanf("%d",&year);
	if(year%4==0)
	{
		printf("it is leap year");
	}
	else
	{
		printf("it is not leap year");
	}
	
}