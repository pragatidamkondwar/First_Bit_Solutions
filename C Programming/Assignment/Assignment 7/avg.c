#include<stdio.h>
void average(int*,int*,int*,int*,int*);//function decleration
void main()
{
	 int a , b , c ,d , e;
	 printf("enter the five numbers");
	 scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	 average(&a, &b,&c,&d,&e);//function call
}
//main function end here
void average(int* a ,int* b,int* c,int* d,int* e)//function defination
{
     int sum1=*a + *b + *c + *d + *e;
     printf("sum of %d",sum1);
	 int avg1= sum1 / 5;
	 printf("addition of five numbers %d",avg1);
}
