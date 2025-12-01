#include<stdio.h>
void perfect(int*);//decleration
void main()
{
	int num;
	printf("enter the number");
	scanf("%d",&num);
	 perfect(&num);//call	
	
	
}
void perfect(int *num)//defination
{
	int sum=0 ,  i=1;
	while(i<*num)
	{
		if(*num%i==0)
		{
			sum= sum+i;
		}
		i++;
	}
		if(sum==*num)
		{
        printf("no is perfect");
		}
		else
		{
		printf("no is not perfect");
		}
}