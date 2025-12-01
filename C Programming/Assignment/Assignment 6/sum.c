#include<stdio.h>
void sum();//function decleration
void main()
{
	sum();//function call
}
// main function end here
void sum()//function defination
{

	int i=1;
	while(i<=10)
	{
		printf("%d\n",i);
		i++;
	}
}