#include<stdio.h>
void per(int*);//decleration
void main()
{
	int marks;
	printf("enter the marks");
	scanf("%d",&marks);
	per(&marks);//call
	
}// main end here
void per(int *marks)//defination
{
	if(*marks>75)
	{
		printf("Distinction");
	}
	else
	{
		if(*marks>65)
		{
			printf("first class");
		}
		else
		{
			if(*marks>55)
			{
				printf("Second class");
			}
			else
			{
				if(*marks>=40)
				{
					printf("pass");
				}
				else
				{
					printf("fail");
				}
			}
			}
		}
}