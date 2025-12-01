#include<stdio.h>
void evenodd();//function decleration
void main()
{
	evenodd();//function call
}
//main function end here
void evenodd()//function defination 
{
	int no= 775;
	if(no%2==0)
	{
		printf("no is even");
	}
	else
	{
		printf("no is odd");
	}
}