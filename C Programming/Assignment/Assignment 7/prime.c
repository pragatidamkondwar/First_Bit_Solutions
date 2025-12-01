#include<stdio.h>
void prime(int*);//decleration
void main()
{
	int no;
	printf("enter the number");
	scanf("%d",&no);
	prime(&no);//call	
}
// main end here
 void prime(int *no)//defination
{
	int i=2;
	while(i<*no)
	{
		if(*no%i==0)
		{
			printf("no is not prime");
			break;
		}
		i++;
		if(i==*no)
		{
			printf("no is prime");
		}
	}
}