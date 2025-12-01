#include<stdio.h>
void triangle(int*, int*, int*); 
void main()
{
   int a,b,c;
   printf("enter the number");
   scanf("%d",&a);
   printf("enter the number");
   scanf("%d",&b);
   printf("enter the number");
   scanf("%d",&c);
   triangle(&a,&b,&c);
}
// main end here
void triangle(int *a,int *b,int *c)
 {
 		if(*a==*b&&*b==*c)
		{
		printf("equilateral");
		}
		else
		{
			if(*a==*b||*b==*c||*a==*c)
			{
				printf("isosceles");
			}
			else
			{
			printf("scalene");
			}
		}
 }