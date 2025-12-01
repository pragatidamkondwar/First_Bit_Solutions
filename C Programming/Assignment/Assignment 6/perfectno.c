#include<stdio.h>
void perfectno();//function decleration
void main()
{
 perfectno();//function call
}
//main function end here
void perfectno()//function defination
{
	int num=6 , sum=0 ,  i=1;
	while(i<num)
	{
		if(num%i==0)
		{
			sum= sum+i;
		}
		i++;
	}
		if(sum==num)
		{
			printf("no is perfect");
		}
		else
		{
			printf("no is not perfect");
		}
	
}