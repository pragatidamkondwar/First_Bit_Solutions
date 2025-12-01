#include<stdio.h>
void main()
{
	int no;
	printf("Enter the number");
	scanf("%d",&no);
	if(no>0)
		{
		printf("no is positive");
	}
		else
		{
			if(no<0)
				printf("no is negative");
		else
			printf("no is zero");
		}
}