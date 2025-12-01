#include<stdio.h>
void armstrong();//function decleration
void main()
{
	armstrong();//function call
}
//main function end here
void armstrong()//function defination
{
		int no=153 , r , sum=0 , temp;
	temp=no;
	while(no!=0)
	{
		r=no%10;
		sum=sum+r*r*r;
		no=no/10;
	}
	
	if(sum==temp)
		printf("no is armstrong");
	else
		printf("no is not armstrong");
}