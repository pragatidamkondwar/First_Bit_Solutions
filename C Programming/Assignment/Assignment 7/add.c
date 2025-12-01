#include<stdio.h>
void add(int* , int*);
void main()
{
	int a,b;
 	 printf("enter the number");
 	 scanf("%d",&a);
 	 printf("enter the number");
 	 scanf("%d",&b);
 	 add(&a,&b);
}
void add(int *x,int *y)//
{
 int*c= *x + *y;
 printf("addition of x and y %d", c);
}