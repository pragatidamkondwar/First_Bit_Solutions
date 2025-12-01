#include<stdio.h>
void swap(int*,int*);//function decleration
void main()
{
	int a, b ;
	printf("enter the first numbera=");
	scanf("%d",&a);
	printf("enter the second numberb=");
	scanf("%d",&b);
     swap(&a,&b); //function call
    
}
//main function end here
void swap(int *a,int *b)
{
   int temp=*a;
    *a=*b;
	*b= temp;
	printf("swap two numbers:a=%d",*a);	
	printf("swap two numbers:b=%d",*b);	
	
}
