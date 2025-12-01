#include<stdio.h>
void threeside(int* , int*, int*);//decleration
void main()
{
	int a , b, c;
	printf("enter the first number");
	scanf("%d",&a);
	printf("enter the second number");
	scanf("%d",&b);
	printf("enter the third number");
	scanf("%d",&c);
	threeside( &a , &b, &c);//call
	
}
// main end here
void threeside(int *a,int *b,int *c)//defination
{
	if(*a > *b && *a > *c)
	{
	{
	printf("a is greatest");
		}	
	}
	else
	{
		if(*b > *a && *b > *c)
		{
		printf("b is greatest");
		}
		else
		{
			printf("c is greatest");
		}
		
	}
}