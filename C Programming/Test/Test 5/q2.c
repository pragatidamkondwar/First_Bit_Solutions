#include<stdio.h>
int fun();//function decleration
void main()
{
	
	 int amount=10000;
	 fun();// function call
	
}
int fun()//function defination
{
	int amount;
	if(amount<3000)
	{
		printf("to deposit ");
	}
	else
	{
		printf("can't withdraw the amount balance is not sufficient");
	}
	
}