#include<stdio.h>
void ope(int* , int* , char* , int*);//decleration
void main()
{
	int no1 , no2 , operator , sum;
	printf("enter the first number");
	scanf("%d",&no1);
	printf("enter the second number");
	scanf("%d",&no2);
	printf("select operator");
	scanf("%c",operator);
	ope( &no1 , &no2 , &operator , *sum); 
	
	
}
void  ope(int *no1 , int *no2, char *operator, int *sum)// defination
{
    
	operator='+';
	if(operator=='/')
	{
		sum=no1+no2;
		printf("addition%d",sum);
	}
	else
	{
		if(operator=='-')
		{
			sum=no1-no2;
			printf("subtraction%d",sum);
		}
		else
		{
			if(operator=='*')
			{
				sum=no1*no2;
				printf("Multiplication%d",sum);
			}
			else
			{
				if(operator=='/')
				{
					sum=no1/no2;
					printf("Division%d",sum);
				}
				else
				{
					if(operator=='%')
					{
						sum=no1%no2;
						printf("Mode%d",sum);
					}
				}
			}
		}
	}
}