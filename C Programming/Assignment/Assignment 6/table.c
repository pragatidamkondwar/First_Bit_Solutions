#include<stdio.h>
void table();//function decleration
{
	table();//function call
}
//main function end here
void table()//function defination
{
	int i=1, num;
	while(i<=10)
	{
		num=i*5;
		printf("%d\n",num);
		i++;
	}
}