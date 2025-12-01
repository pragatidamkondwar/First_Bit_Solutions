#include<stdio.h>
void factoiral(int*);
void main()
{
	int no;
	printf("enter the number");
	scanf("%d",&no);
	factorial(&no);
}
factorial(int *no)
{
	
	int i=*no;
	int fact=1;
	{
		while(i>1)
		{
			fact=fact*i;
			i--;
		}
		printf("factorial %d is %d",*no,fact);
	}
}