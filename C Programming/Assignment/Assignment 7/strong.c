#include<stdio.h>
void strong(int);
void main()
{
	int num;
	printf("enter the number");
	scanf("%d",&num);
	strong(num);
}
// main end here
void strong(int num)
{
	int  sum=0, temp=*num , i, fact, r;
	
	while(temp!=0)
	{
		r=temp%10;
		fact=1;
		i=1;
		while(i<=r)
		{
			fact=fact*i;
			i++;
			
		}
		sum=sum+fact;
		temp=temp/10;
			
		}
	
	if(sum==num)
	{
		printf("%d it is strong number",num);
	}
	else
	{
		printf("%d no is not strong number",num);
	}
}