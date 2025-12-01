#include<stdio.h>
void prime();//function decleration
void main()
{
	prime();//function call
}
//main function end here
void prime()
{
		
	int no=7;
	int i=2;
	while(i<no)
	{
		if(no%i==0)
		{
			printf("no is not prime");
			break;
		}
		i++;
		if(i==no)
		{
			printf("no is prime");
		}
	}
}