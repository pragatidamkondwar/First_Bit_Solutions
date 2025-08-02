#include<stdio.h>
void main()
{

	int num= 146, sum=0, temp=num , i=1, fact=1 , r;
	while(temp!=0)
	{
		fact=1;
		 r=temp%10;
		while(i<=r)
		{
			fact=fact*i;
			
		}
		i++;
	}
	if(sum==num)
	{
		printf("no is strong number");
	}
	else
	{
		printf("no is not strong number");
	}
}
